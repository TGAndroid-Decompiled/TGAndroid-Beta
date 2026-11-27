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
import org.telegram.ui.ActionBar.e;
public final class ie1 extends e {
    public he1 a;
    public he1 b;
    public s7 c;
    public vnb d;

    public final void Y() {
        String str;
        TLRPC.User f = yac.h(this.currentAccount).f();
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
                TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
                if (X1 != null) {
                    X1.first_name = updateprofile.first_name;
                    X1.last_name = updateprofile.last_name;
                }
                yac.h(this.currentAccount).u(true);
                jn7.f(this.currentAccount).k(jn7.j0, new Object[0]);
                jn7.f(this.currentAccount).k(2, 1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateprofile, new xe2((byte) 0));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        vnb vnbVar = this.d;
        yob.l(this.actionBar, 3, aob.f8, vnbVar);
        yob.l(this.actionBar, 1, aob.v8, vnbVar);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(ob6.M0(2131751229, null));
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 18));
        this.c = this.actionBar.u().h(1, 2131231245, hl.L(56.0f), ob6.M0(2131751319, null));
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
        if (X1 == null) {
            X1 = yac.h(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new q8((byte) 22));
        he1 he1Var = new he1(this, context, (byte) 0);
        this.a = he1Var;
        he1Var.setTextSize(1, 18.0f);
        he1 he1Var2 = this.a;
        int i3 = aob.H6;
        yob.D(he1Var2, i3, vnbVar);
        he1 he1Var3 = this.a;
        int i4 = aob.G6;
        yob.X(he1Var3, i4, vnbVar);
        this.a.setBackgroundDrawable(null);
        he1 he1Var4 = this.a;
        int i5 = aob.k6;
        int i6 = aob.l6;
        int i7 = aob.p7;
        yob.F(he1Var4, i5, i6, i7, vnbVar);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        he1 he1Var5 = this.a;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        he1Var5.setGravity(i);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(ob6.M0(2131750654, null));
        yob.v(this.a, i4, vnbVar);
        this.a.setCursorSize(hl.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, tre.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ie1 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                byte b = r2;
                ie1 ie1Var = this.b;
                switch (b) {
                    case 0:
                        if (i8 != 5) {
                            return false;
                        }
                        ie1Var.b.requestFocus();
                        he1 he1Var6 = ie1Var.b;
                        he1Var6.setSelection(he1Var6.length());
                        return true;
                    default:
                        if (i8 != 6) {
                            return false;
                        }
                        ie1Var.c.performClick();
                        return true;
                }
            }
        });
        he1 he1Var6 = new he1(this, context, (byte) 1);
        this.b = he1Var6;
        he1Var6.setTextSize(1, 18.0f);
        yob.D(this.b, i3, vnbVar);
        yob.X(this.b, i4, vnbVar);
        this.b.setBackgroundDrawable(null);
        yob.F(this.b, i5, i6, i7, vnbVar);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        he1 he1Var7 = this.b;
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        he1Var7.setGravity(i2);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(ob6.M0(2131748786, null));
        yob.v(this.b, i4, vnbVar);
        this.b.setCursorSize(hl.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, tre.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ie1 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                byte b = r2;
                ie1 ie1Var = this.b;
                switch (b) {
                    case 0:
                        if (i8 != 5) {
                            return false;
                        }
                        ie1Var.b.requestFocus();
                        he1 he1Var62 = ie1Var.b;
                        he1Var62.setSelection(he1Var62.length());
                        return true;
                    default:
                        if (i8 != 6) {
                            return false;
                        }
                        ie1Var.c.performClick();
                        return true;
                }
            }
        });
        if (X1 != null) {
            this.a.setText(X1.first_name);
            he1 he1Var8 = this.a;
            he1Var8.setSelection(he1Var8.length());
            this.b.setText(X1.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final vnb getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        he1 he1Var = this.a;
        int i = aob.k6;
        arrayList.add(new apb(he1Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        he1 he1Var2 = this.a;
        int i2 = aob.l6;
        arrayList.add(new apb(he1Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!uc7.e1().getBoolean("view_animations", true)) {
            this.a.requestFocus();
            hl.E3(this.a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            hl.d3(new fv0(this, (byte) 22), 100L);
        }
    }
}
