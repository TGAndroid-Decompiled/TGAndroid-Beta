package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ymb extends d implements gk7 {
    public String E;
    public a5b F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final akb J;
    public final zjb K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public r7 c;
    public mhb d;
    public mhb e;
    public tmb f;
    public uib h;
    public mhb n;
    public hd r;
    public ld5 s;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public ymb(akb akbVar, zjb zjbVar, boolean z) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i;
        this.J = akbVar;
        this.K = zjbVar;
        if (zjbVar != null) {
            tL_theme = zjbVar.r;
        } else {
            tL_theme = akbVar.G;
        }
        this.L = tL_theme;
        if (zjbVar != null) {
            i = zjbVar.t;
        } else {
            i = akbVar.F;
        }
        this.currentAccount = i;
        this.I = z;
    }

    public final boolean Y(String str, boolean z) {
        a5b a5bVar = this.F;
        if (a5bVar != null) {
            gl.r(a5bVar);
            this.F = null;
            this.E = null;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (i == 0 && charAt >= '0' && charAt <= '9') {
                        if (z) {
                            ij.r0(this, k96.M0(2131743949, null), k96.M0(2131745310, null), null);
                            return false;
                        }
                        e0(bkb.o7, k96.M0(2131745310, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z) {
                            ij.r0(this, k96.M0(2131743949, null), k96.M0(2131745313, null), null);
                            return false;
                        }
                        e0(bkb.o7, k96.M0(2131745313, null));
                        return false;
                    }
                }
            } else {
                e0(bkb.o7, k96.M0(2131745313, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z) {
                    ij.r0(this, k96.M0(2131743949, null), k96.M0(2131745312, null), null);
                    return false;
                }
                e0(bkb.o7, k96.M0(2131745312, null));
                return false;
            }
            if (!z) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    e0(bkb.v6, k96.a0("SetUrlAvailable", null, 2131745316, str));
                    return true;
                }
                e0(bkb.E6, k96.M0(2131745315, null));
                this.E = str;
                a5b a5bVar2 = new a5b(this, str, (byte) 11);
                this.F = a5bVar2;
                gl.d3(a5bVar2, 300L);
            }
            return true;
        } else if (z) {
            ij.r0(this, k96.M0(2131743949, null), k96.M0(2131745311, null), null);
            return false;
        } else {
            e0(bkb.o7, k96.M0(2131745311, null));
            return false;
        }
    }

    public final void Z(String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(createtheme, new apa(this, str, (byte) 13), 2);
    }

    public final void a0(TLRPC.TL_theme tL_theme) {
        try {
            this.r.dismiss();
            this.r = null;
        } catch (Exception e) {
            fa4.g(e, true);
        }
        bkb.G1(this.J, this.K, tL_theme, this.currentAccount, false);
        finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.vb));
        hashSet.add(Integer.valueOf(bkb.ub));
        hashSet.add(Integer.valueOf(bkb.tb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.v6));
        hashSet.add(Integer.valueOf(bkb.E6));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0(TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            this.r.dismiss();
            this.r = null;
        } catch (Exception e) {
            fa4.g(e, true);
        }
        ij.c0(this.currentAccount, tL_error, this, updatetheme, new Object[0]);
    }

    public final void c0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        a aVar = this.actionBar;
        boolean z = this.I;
        if (z) {
            aVar.setTitle(k96.M0(2131748060, null));
        } else {
            aVar.setTitle(k96.M0(2131751206, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 18));
        this.c = this.actionBar.t().e(1, k96.M0(2131751342, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        zkb.h(bkb.Z6, null, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new jz1((byte) 29));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.x;
        int i2 = bkb.c6;
        zkb.h(i2, null, linearLayout4);
        linearLayout2.addView(this.x, nme.o(-1, -2));
        ld5 ld5Var = new ld5(context, 23);
        this.s = ld5Var;
        ld5Var.setText(k96.M0(2131749005, null));
        this.x.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i3 = bkb.G6;
        zkb.D(editTextBoldCursor2, i3, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i4 = bkb.F6;
        zkb.X(editTextBoldCursor3, i4, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.b;
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor4.setGravity(i | 16);
        this.b.setBackgroundDrawable(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(k96.M0(2131743935, null));
        zkb.v(this.b, i4, null);
        this.b.setCursorSize(gl.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, nme.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ymb b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                r7 r7Var;
                byte b = r2;
                ymb ymbVar = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 6) {
                            return false;
                        }
                        gl.t1(ymbVar.b);
                        return true;
                    default:
                        if (i5 != 6 || (r7Var = ymbVar.c) == null) {
                            return false;
                        }
                        r7Var.performClick();
                        return true;
                }
            }
        });
        this.x.addView(new pzb(context, (byte) 1), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.x.addView(linearLayout5, nme.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().N2 + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        zkb.D(this.w, i3, null);
        zkb.X(this.w, i4, null);
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout5.addView(this.w, nme.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        zkb.D(this.a, i3, null);
        zkb.X(this.a, i4, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(k96.M0(2131745309, null));
        zkb.v(this.a, i4, null);
        this.a.setCursorSize(gl.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, nme.o(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ymb b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                r7 r7Var;
                byte b = r2;
                ymb ymbVar = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 6) {
                            return false;
                        }
                        gl.t1(ymbVar.b);
                        return true;
                    default:
                        if (i5 != 6 || (r7Var = ymbVar.c) == null) {
                            return false;
                        }
                        r7Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new jf6(this, (byte) 17));
        if (z) {
            this.a.setOnFocusChangeListener(new ls0(this, (byte) 18));
        }
        mhb mhbVar = new mhb(context);
        this.e = mhbVar;
        int i5 = bkb.a7;
        zkb.Z(mhbVar, context, 2131231233, i5);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, nme.o(-1, -2));
        mhb mhbVar2 = new mhb(context);
        this.d = mhbVar2;
        mhbVar2.getTextView().setMovementMethod(new cl((byte) 3));
        zkb.C(this.d.getTextView(), bkb.J6, null);
        mhb mhbVar3 = this.d;
        if (z) {
            mhbVar3.setText(gl.S2(k96.M0(2131743944, null)));
        } else {
            SpannableStringBuilder S2 = gl.S2(k96.M0(2131743903, null));
            this.H = S2;
            mhbVar3.setText(S2);
        }
        linearLayout2.addView(this.d, nme.o(-1, -2));
        mhb mhbVar4 = this.d;
        if (z) {
            zkb.Z(mhbVar4, context, 2131231232, i5);
            tmb tmbVar = new tmb(context, this.parentLayout, 1);
            this.f = tmbVar;
            linearLayout2.addView(tmbVar, nme.o(-1, -2));
            uib uibVar = new uib(context);
            this.h = uibVar;
            ff0 L0 = bkb.L0(true);
            vkb M = zkb.M(i2);
            vkb M2 = zkb.M(bkb.h6);
            uibVar.setBackground(L0);
            zkb.j(uibVar, L0, M, M2, null);
            this.h.b(k96.M0(2131743560, null), false);
            linearLayout2.addView(this.h, nme.o(-1, -2));
            this.h.setOnClickListener(new b99(this, context, (byte) 28));
            mhb mhbVar5 = new mhb(context);
            this.n = mhbVar5;
            mhbVar5.setText(gl.S2(k96.M0(2131743559, null)));
            zkb.Z(this.n, context, 2131231233, i5);
            linearLayout2.addView(this.n, nme.o(-1, -2));
        } else {
            zkb.Z(mhbVar4, context, 2131231233, i5);
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    public final void d0() {
        if (!Y(this.a.getText().toString(), true) || getParentActivity() == null) {
            return;
        }
        if (this.b.length() == 0) {
            ij.r0(this, k96.M0(2131743949, null), k96.M0(2131743936, null), null);
            return;
        }
        boolean z = this.I;
        TLRPC.TL_theme tL_theme = this.L;
        if (z) {
            String str = tL_theme.title;
            hd hdVar = new hd(3, null, getParentActivity());
            this.r = hdVar;
            hdVar.setOnCancelListener(new Object());
            this.r.show();
            String obj = this.b.getText().toString();
            tL_theme.title = obj;
            akb akbVar = this.J;
            akbVar.a = obj;
            akbVar.G.slug = this.a.getText().toString();
            bkb.v1(akbVar, true, true, true);
            return;
        }
        String str2 = tL_theme.slug;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = tL_theme.title;
        if (str4 != null) {
            str3 = str4;
        }
        String obj2 = this.a.getText().toString();
        String obj3 = this.b.getText().toString();
        if (str2.equals(obj2) && str3.equals(obj3)) {
            finishFragment();
            return;
        }
        this.r = new hd(3, null, getParentActivity());
        TL_account.updateTheme updatetheme = new TL_account.updateTheme();
        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
        tL_inputTheme.id = tL_theme.id;
        tL_inputTheme.access_hash = tL_theme.access_hash;
        updatetheme.theme = tL_inputTheme;
        updatetheme.format = "android";
        updatetheme.slug = obj2;
        int i = updatetheme.flags;
        updatetheme.title = obj3;
        updatetheme.flags = i | 3;
        int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatetheme, new apa(this, updatetheme, (byte) 14), 2);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
        this.r.setOnCancelListener(new xs0(this, sendRequest, (byte) 9));
        this.r.show();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        hd hdVar;
        hd hdVar2;
        int i3 = kk7.L2;
        zjb zjbVar = this.K;
        akb akbVar = this.J;
        if (i == i3) {
            akb akbVar2 = (akb) objArr[0];
            zjb zjbVar2 = (zjb) objArr[1];
            if (akbVar2 == akbVar && zjbVar2 == zjbVar && (hdVar2 = this.r) != null) {
                try {
                    hdVar2.dismiss();
                    this.r = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                bkb.t(akbVar, true, false);
                finishFragment();
            }
        } else if (i == kk7.M2) {
            akb akbVar3 = (akb) objArr[0];
            zjb zjbVar3 = (zjb) objArr[1];
            if (akbVar3 == akbVar && zjbVar3 == zjbVar && (hdVar = this.r) != null) {
                try {
                    hdVar.dismiss();
                    this.r = null;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
        }
    }

    public final void e0(int i, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        mhb mhbVar = this.e;
        boolean z = this.I;
        if (isEmpty) {
            mhbVar.setVisibility(8);
            mhb mhbVar2 = this.d;
            if (z) {
                zkb.Z(mhbVar2, getParentActivity(), 2131231232, bkb.a7);
                return;
            } else {
                zkb.Z(mhbVar2, getParentActivity(), 2131231233, bkb.a7);
                return;
            }
        }
        mhbVar.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i));
        this.e.setTextColorByKey(i);
        mhb mhbVar3 = this.d;
        if (z) {
            zkb.Z(mhbVar3, getParentActivity(), 2131231234, bkb.a7);
        } else {
            mhbVar3.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Uc));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vc));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Kd));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qb));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Od));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Tb));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qd));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vb));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.de));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ic));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ee));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.dc));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.L2);
        getNotificationCenter().b(this, kk7.M2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.L2);
        getNotificationCenter().n(this, kk7.M2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!na7.c1().getBoolean("view_animations", true) && this.I) {
            this.a.requestFocus();
            gl.E3(this.a);
        }
        gl.V2(getParentActivity(), this.classGuid);
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                zkb.l(editTextBoldCursor, 30, bkb.F6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                zkb.l(editTextBoldCursor2, 30, bkb.F6, null);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !this.I) {
            this.a.requestFocus();
            gl.E3(this.a);
        }
    }
}
