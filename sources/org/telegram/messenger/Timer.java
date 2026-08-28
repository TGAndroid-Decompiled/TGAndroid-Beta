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
                int i9 = timer.pad;
                timer.pad = i9 - 1;
                this.pad = i9;
            }
            this.endTime = System.currentTimeMillis();
        }

        public String toString() {
            String q10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.task);
            sb2.append(": ");
            if (this.endTime < 0) {
                q10 = "not done";
            } else {
                q10 = aa.d.q(new StringBuilder(), this.endTime - this.startTime, "ms");
            }
            sb2.append(q10);
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
        for (int i9 = 0; i9 < this.tasks.size(); i9++) {
            if (this.tasks.get(i9) != null) {
                sb2.append("#");
                sb2.append(i9);
                int i10 = this.tasks.get(i9).pad;
                for (int i11 = 0; i11 < i10; i11++) {
                    sb2.append(" ");
                }
                sb2.append(" ");
                sb2.append(this.tasks.get(i9));
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
