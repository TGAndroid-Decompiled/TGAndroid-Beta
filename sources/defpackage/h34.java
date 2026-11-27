package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class h34 extends e {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public d34 f;
    public qo0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 15));
        this.simpleActionBar.setTitle(ob6.M0(2131743636, null));
        FrameLayout frameLayout = new FrameLayout(context);
        d34 d34Var = new d34(this, new n82(this, (byte) 27), new lu3(this, (byte) 6), null, (byte) 0);
        this.f = d34Var;
        d34Var.s1();
        this.f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f, tre.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().M0(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
