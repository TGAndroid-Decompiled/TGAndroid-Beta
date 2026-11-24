package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class mpc extends sm3 {
    public final npc M;

    public mpc(npc npcVar, Context context) {
        super(context);
        this.M = npcVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.M.y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
