package org.telegram.messenger;

import org.telegram.SQLite.SQLitePreparedStatement;
public final class bh implements Runnable {
    public final ri f23100a;
    public final long f23101b;
    public final int f23102c;
    public final double d;

    public bh(ri riVar, long j3, int i7, double d) {
        this.f23100a = riVar;
        this.f23101b = j3;
        this.f23102c = i7;
        this.d = d;
    }

    @Override
    public final void run() {
        ri riVar = this.f23100a;
        long j3 = this.f23101b;
        int i7 = this.f23102c;
        double d = this.d;
        try {
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27082b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j3);
            executeFast.bindInteger(2, i7);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
