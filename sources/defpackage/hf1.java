package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class hf1 extends d {
    public gf1 a;
    public gf1 b;
    public r7 c;
    public ylb d;

    public final void Z() {
        String str;
        TLRPC.User f = z8c.h(this.currentAccount).f();
        if (f != null && this.b.getText() != null && this.a.getText() != null) {
            String obj = this.a.getText().toString();
            String obj2 = this.b.getText().toString();
            String str2 = f.first_name;
            if (str2 == null || !str2.equals(obj) || (str = f.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                f.first_name = obj;
                updateprofile.last_name = obj2;
                f.last_name = obj2;
                TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
                if (W1 != null) {
                    W1.first_name = updateprofile.first_name;
                    W1.last_name = updateprofile.last_name;
                }
                z8c.h(this.currentAccount).u(true);
                nm7.f(this.currentAccount).k(nm7.j0, new Object[0]);
                nm7.f(this.currentAccount).k(2, 1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateprofile, new nf2((byte) 0));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        ylb ylbVar = this.d;
        anb.l(this.actionBar, 3, cmb.e8, ylbVar);
        anb.l(this.actionBar, 1, cmb.u8, ylbVar);
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(jb6.M0(2131751201, null));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 18));
        this.c = this.actionBar.t().h(1, 2131231246, gm.L(56.0f), jb6.M0(2131751291, null));
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
        if (W1 == null) {
            W1 = z8c.h(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new p8((byte) 22));
        gf1 gf1Var = new gf1(this, context, (byte) 0);
        this.a = gf1Var;
        gf1Var.setTextSize(1, 18.0f);
        gf1 gf1Var2 = this.a;
        int i3 = cmb.G6;
        anb.D(gf1Var2, i3, ylbVar);
        gf1 gf1Var3 = this.a;
        int i4 = cmb.F6;
        anb.X(gf1Var3, i4, ylbVar);
        this.a.setBackgroundDrawable(null);
        gf1 gf1Var4 = this.a;
        int i5 = cmb.j6;
        int i6 = cmb.k6;
        int i7 = cmb.o7;
        anb.F(gf1Var4, i5, i6, i7, ylbVar);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        gf1 gf1Var5 = this.a;
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        gf1Var5.setGravity(i);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(jb6.M0(2131750626, null));
        anb.v(this.a, i4, ylbVar);
        this.a.setCursorSize(gm.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, qoe.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hf1 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                byte b = r2;
                hf1 hf1Var = this.b;
                switch (b) {
                    case 0:
                        if (i8 != 5) {
                            return false;
                        }
                        hf1Var.b.requestFocus();
                        gf1 gf1Var6 = hf1Var.b;
                        gf1Var6.setSelection(gf1Var6.length());
                        return true;
                    default:
                        if (i8 != 6) {
                            return false;
                        }
                        hf1Var.c.performClick();
                        return true;
                }
            }
        });
        gf1 gf1Var6 = new gf1(this, context, (byte) 1);
        this.b = gf1Var6;
        gf1Var6.setTextSize(1, 18.0f);
        anb.D(this.b, i3, ylbVar);
        anb.X(this.b, i4, ylbVar);
        this.b.setBackgroundDrawable(null);
        anb.F(this.b, i5, i6, i7, ylbVar);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        gf1 gf1Var7 = this.b;
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        gf1Var7.setGravity(i2);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(jb6.M0(2131748789, null));
        anb.v(this.b, i4, ylbVar);
        this.b.setCursorSize(gm.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, qoe.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hf1 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                byte b = r2;
                hf1 hf1Var = this.b;
                switch (b) {
                    case 0:
                        if (i8 != 5) {
                            return false;
                        }
                        hf1Var.b.requestFocus();
                        gf1 gf1Var62 = hf1Var.b;
                        gf1Var62.setSelection(gf1Var62.length());
                        return true;
                    default:
                        if (i8 != 6) {
                            return false;
                        }
                        hf1Var.c.performClick();
                        return true;
                }
            }
        });
        if (W1 != null) {
            this.a.setText(W1.first_name);
            gf1 gf1Var8 = this.a;
            gf1Var8.setSelection(gf1Var8.length());
            this.b.setText(W1.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final ylb getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        gf1 gf1Var = this.a;
        int i = cmb.j6;
        arrayList.add(new cnb(gf1Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        gf1 gf1Var2 = this.a;
        int i2 = cmb.k6;
        arrayList.add(new cnb(gf1Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!oc7.d1().getBoolean("view_animations", true)) {
            this.a.requestFocus();
            gm.E3(this.a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            gm.d3(new yt0(this, (byte) 22), 100L);
        }
    }
}
