package defpackage;

import android.util.Log;
public final class olc implements Runnable {
    public final byte a;
    public final Object b;

    public olc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        d3d d3dVar = (d3d) this.b;
        Log.w("FirebaseMessaging", "Service took too long to process intent: " + d3dVar.a.getAction() + " finishing.");
        d3dVar.b.trySetResult(null);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olc.run():void");
    }
}
