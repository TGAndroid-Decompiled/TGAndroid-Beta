package defpackage;

import org.telegram.tgnet.tl.TL_feed;
public final class yl7 implements Runnable {
    public final byte a;
    public final lm7 b;
    public final jm7 c;

    public yl7(lm7 lm7Var, jm7 jm7Var, byte b) {
        this.a = b;
        this.b = lm7Var;
        this.c = jm7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jm7 jm7Var = this.c;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                lm7Var.x0(jm7Var);
                return;
            default:
                jm7Var.t = null;
                TL_feed.TL_feed_readFeed tL_feed_readFeed = new TL_feed.TL_feed_readFeed();
                tL_feed_readFeed.max_position = jm7Var.s;
                lm7Var.getConnectionsManager().sendRequest(tL_feed_readFeed, new xl7(lm7Var, (byte) 1));
                return;
        }
    }
}
