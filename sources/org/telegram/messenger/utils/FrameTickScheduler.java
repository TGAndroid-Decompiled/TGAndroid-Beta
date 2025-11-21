package org.telegram.messenger.utils;

import android.view.Choreographer;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

public abstract class FrameTickScheduler {
    private static final Choreographer.FrameCallback callback = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j) {
            FrameTickScheduler.doFrame(j);
        }
    };
    private static final Map subs = new WeakHashMap();
    private static boolean running = false;
    private static long frameCounter = 0;

    public static int getFrameSparseness(int i) {
        return normN(Math.round(AndroidUtilities.screenRefreshRate / i));
    }

    public static void subscribe(Runnable runnable, int i) {
        subscribe(runnable, getFrameSparseness(i), 0);
    }

    public static void subscribe(Runnable runnable, int i, int i2) {
        if (runnable == null || i <= 0) {
            return;
        }
        Map map = subs;
        if (map.containsKey(runnable)) {
            return;
        }
        map.put(runnable, new Sub(runnable, normN(i), normI(i2, i)));
        ensureRunning();
    }

    public static void unsubscribe(Runnable runnable) {
        subs.remove(runnable);
        checkStop();
    }

    public static void doFrame(long j) {
        frameCounter++;
        for (Sub sub : subs.values()) {
            if (frameCounter % sub.n == sub.i) {
                sub.action.run();
            }
        }
        if (running) {
            Choreographer.getInstance().postFrameCallback(callback);
        }
    }

    private static void ensureRunning() {
        if (running) {
            return;
        }
        running = true;
        Choreographer.getInstance().postFrameCallback(callback);
    }

    private static void checkStop() {
        if (subs.isEmpty()) {
            running = false;
        }
    }

    private static int normN(int i) {
        return Math.max(1, i);
    }

    private static int normI(int i, int i2) {
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    public static class Sub {
        final Runnable action;
        final int i;
        final int n;

        Sub(Runnable runnable, int i, int i2) {
            this.action = runnable;
            this.n = i;
            this.i = i2;
        }
    }
}
