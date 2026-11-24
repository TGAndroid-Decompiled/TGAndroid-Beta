package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class m24 extends d {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public i24 f;
    public qo0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 14));
        this.simpleActionBar.setTitle(k96.M0(2131743742, null));
        FrameLayout frameLayout = new FrameLayout(context);
        i24 i24Var = new i24(this, new w72(this, (byte) 27), new kx3(this, (byte) 4), null, (byte) 0);
        this.f = i24Var;
        i24Var.r1();
        this.f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f, nme.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().K0(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
