package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class a39 extends d implements jm7 {
    public r59 a;
    public w29 b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public e7a h;
    public y29 n;

    public a39() {
        super(null);
        this.d = -1;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(jb6.M0(2131746120, null));
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 7));
        FrameLayout frameLayout = new FrameLayout(context);
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((sc3) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new u46());
        r59 r59Var2 = this.a;
        w29 w29Var = new w29(this, context);
        this.b = w29Var;
        r59Var2.setAdapter(w29Var);
        this.a.setOnItemClickListener(new s19(this, (byte) 2));
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        h0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == nm7.Z4) {
                this.b.f();
            } else if (i == nm7.j5) {
                h0();
                this.b.f();
            }
        }
    }

    public final void g0(View view) {
        int i;
        int i2;
        Point point;
        if (view instanceof vb0) {
            vb0 vb0Var = (vb0) view;
            if (vb0Var.n && !getUserConfig().p()) {
                showDialog(new kj8((d) this, 4, true));
                return;
            }
            hs6.d0(this.currentAccount).c2(vb0Var.f.reaction);
            this.a.getAdapter().l(0, this.a.getAdapter().b());
        } else if (view instanceof z29) {
            z29 z29Var = (z29) view;
            if (this.n == null) {
                mz9[] mz9VarArr = new mz9[1];
                tm tmVar = z29Var.a;
                if (tmVar != null) {
                    tmVar.f();
                    z29Var.b();
                    Rect rect = gm.Q;
                    rect.set(tmVar.getBounds());
                    i2 = (-(z29Var.getHeight() - rect.centerY())) - gm.L(16.0f);
                    i = rect.centerX() - ((gm.q.x - gm.L(12.0f)) - ((int) Math.min(gm.L(324.0f), point.x * 0.95f)));
                } else {
                    i = 0;
                    i2 = 0;
                }
                x29 x29Var = new x29(this, this, getParentActivity(), Integer.valueOf(i), z29Var, mz9VarArr);
                String S = getMediaDataController().S();
                if (S != null && S.startsWith("animated_")) {
                    try {
                        x29Var.setSelected(Long.valueOf(Long.parseLong(S.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                ArrayList arrayList = getMediaDataController().h;
                ArrayList arrayList2 = new ArrayList(20);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ?? obj = new Object();
                    obj.f = ((TLRPC.TL_availableReaction) arrayList.get(i3)).reaction;
                    arrayList2.add(obj);
                }
                x29Var.setRecentReactions(arrayList2);
                x29Var.setSaveState(3);
                x29Var.y(tmVar, z29Var);
                y29 y29Var = new y29(this, x29Var);
                this.n = y29Var;
                mz9VarArr[0] = y29Var;
                y29Var.showAsDropDown(z29Var, 0, i2, 53);
                mz9VarArr[0].a();
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 16), cmb.c6, cmb.F6, cmb.y6, cmb.h6, cmb.Z6, cmb.A6, cmb.o7, cmb.e6, cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
    }

    public final void h0() {
        this.f = 2;
        this.c = true;
        if (z8c.h(this.currentAccount).p()) {
            this.d = -1;
            int i = this.f;
            this.f = i + 1;
            this.e = i;
            return;
        }
        this.e = -1;
        this.d = this.f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        e7a e7aVar = this.h;
        if (e7aVar != null) {
            e7aVar.a();
            this.h = null;
        }
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar2 = new e7a(notificationCenter, this);
        e7aVar2.b(nm7.Z4);
        e7aVar2.b(nm7.j5);
        this.h = e7aVar2;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e7a e7aVar = this.h;
        if (e7aVar != null) {
            e7aVar.a();
            this.h = null;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
