package org.telegram.messenger;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;

public class Timer {
    final String name;
    int pad = 0;
    public ArrayList<Task> tasks = new ArrayList<>();
    final long startTime = System.currentTimeMillis();

    public class Log extends Task {
        public Log(String str) {
            super(str);
        }

        @Override
        public String toString() {
            return this.task;
        }
    }

    public class Task {
        int pad;
        final String task;
        long endTime = -1;
        final long startTime = System.currentTimeMillis();

        public Task(String str) {
            this.task = str;
            Timer.this.pad++;
        }

        public void done() {
            if (this.endTime < 0) {
                Timer timer = Timer.this;
                int i = timer.pad;
                timer.pad = i - 1;
                this.pad = i;
            }
            this.endTime = System.currentTimeMillis();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.task);
            sb.append(": ");
            sb.append(this.endTime < 0 ? "not done" : SurfaceContainer$$ExternalSyntheticOutline0.m(new StringBuilder(), this.endTime - this.startTime, "ms"));
            return sb.toString();
        }
    }

    public Timer(String str) {
        this.name = str;
    }

    public static Timer create(String str) {
        if (BuildVars.LOGS_ENABLED) {
            return new Timer(str);
        }
        return null;
    }

    public static void done(Task task) {
        if (task != null) {
            task.done();
        }
    }

    public static void finish(Timer timer) {
        if (timer != null) {
            timer.finish();
        }
    }

    public static void log(Timer timer, String str) {
        if (timer != null) {
            timer.log(str);
        }
    }

    public static Task start(Timer timer, String str) {
        if (timer != null) {
            return timer.start(str);
        }
        return null;
    }

    private void finish() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(" total=");
        sb.append(jCurrentTimeMillis);
        sb.append("ms\n");
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i) != null) {
                sb.append("#");
                sb.append(i);
                int i2 = this.tasks.get(i).pad;
                for (int i3 = 0; i3 < i2; i3++) {
                    sb.append(" ");
                }
                sb.append(" ");
                sb.append(this.tasks.get(i));
                sb.append("\n");
            }
        }
        FileLog.d(sb.toString());
    }

    private void log(String str) {
        this.tasks.add(new Log(str));
    }

    private Task start(String str) {
        Task task = new Task(str);
        this.tasks.add(task);
        return task;
    }
}
