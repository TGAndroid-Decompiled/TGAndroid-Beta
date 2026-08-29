package org.telegram.messenger;

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
                int i10 = timer.pad;
                timer.pad = i10 - 1;
                this.pad = i10;
            }
            this.endTime = System.currentTimeMillis();
        }

        public String toString() {
            String p10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.task);
            sb2.append(": ");
            if (this.endTime < 0) {
                p10 = "not done";
            } else {
                p10 = a4.w.p(new StringBuilder(), this.endTime - this.startTime, "ms");
            }
            sb2.append(p10);
            return sb2.toString();
        }
    }

    public Timer(String str) {
        this.name = str;
    }

    public static Timer create(String str) {
        if (!BuildVars.LOGS_ENABLED) {
            return null;
        }
        return new Timer(str);
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
        long currentTimeMillis = System.currentTimeMillis() - this.startTime;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append(" total=");
        sb2.append(currentTimeMillis);
        sb2.append("ms\n");
        for (int i10 = 0; i10 < this.tasks.size(); i10++) {
            if (this.tasks.get(i10) != null) {
                sb2.append("#");
                sb2.append(i10);
                int i11 = this.tasks.get(i10).pad;
                for (int i12 = 0; i12 < i11; i12++) {
                    sb2.append(" ");
                }
                sb2.append(" ");
                sb2.append(this.tasks.get(i10));
                sb2.append("\n");
            }
        }
        FileLog.d(sb2.toString());
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
