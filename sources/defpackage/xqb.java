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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xqb extends e implements fn7 {
    public String E;
    public hab F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final znb J;
    public final ynb K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public s7 c;
    public ilb d;
    public ilb e;
    public sqb f;
    public qmb h;
    public ilb n;
    public id r;
    public mf5 s;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public xqb(znb znbVar, ynb ynbVar, boolean z) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i;
        this.J = znbVar;
        this.K = ynbVar;
        if (ynbVar != null) {
            tL_theme = ynbVar.r;
        } else {
            tL_theme = znbVar.G;
        }
        this.L = tL_theme;
        if (ynbVar != null) {
            i = ynbVar.t;
        } else {
            i = znbVar.F;
        }
        this.currentAccount = i;
        this.I = z;
    }

    public final boolean Y(String str, boolean z) {
        hab habVar = this.F;
        if (habVar != null) {
            hl.r(habVar);
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
                            jj.r0(this, ob6.M0(2131743843, null), ob6.M0(2131745230, null), null);
                            return false;
                        }
                        e0(aob.p7, ob6.M0(2131745230, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z) {
                            jj.r0(this, ob6.M0(2131743843, null), ob6.M0(2131745233, null), null);
                            return false;
                        }
                        e0(aob.p7, ob6.M0(2131745233, null));
                        return false;
                    }
                }
            } else {
                e0(aob.p7, ob6.M0(2131745233, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z) {
                    jj.r0(this, ob6.M0(2131743843, null), ob6.M0(2131745232, null), null);
                    return false;
                }
                e0(aob.p7, ob6.M0(2131745232, null));
                return false;
            }
            if (!z) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    e0(aob.w6, ob6.a0("SetUrlAvailable", null, 2131745236, str));
                    return true;
                }
                e0(aob.F6, ob6.M0(2131745235, null));
                this.E = str;
                hab habVar2 = new hab(this, str, (byte) 9);
                this.F = habVar2;
                hl.d3(habVar2, 300L);
            }
            return true;
        } else if (z) {
            jj.r0(this, ob6.M0(2131743843, null), ob6.M0(2131745231, null), null);
            return false;
        } else {
            e0(aob.p7, ob6.M0(2131745231, null));
            return false;
        }
    }

    public final void Z(String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(createtheme, new isa(this, str, (byte) 14), 2);
    }

    public final void a0(TLRPC.TL_theme tL_theme) {
        try {
            this.r.dismiss();
            this.r = null;
        } catch (Exception e) {
            cc4.g(e, true);
        }
        aob.G1(this.J, this.K, tL_theme, this.currentAccount, false);
        finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.jd));
        hashSet.add(Integer.valueOf(aob.Db));
        hashSet.add(Integer.valueOf(aob.Cb));
        hashSet.add(Integer.valueOf(aob.Bb));
        hashSet.add(Integer.valueOf(aob.Ab));
        hashSet.add(Integer.valueOf(aob.tb));
        hashSet.add(Integer.valueOf(aob.sb));
        hashSet.add(Integer.valueOf(aob.wb));
        hashSet.add(Integer.valueOf(aob.vb));
        hashSet.add(Integer.valueOf(aob.ub));
        hashSet.add(Integer.valueOf(aob.rb));
        hashSet.add(Integer.valueOf(aob.ta));
        hashSet.add(Integer.valueOf(aob.Uc));
        hashSet.add(Integer.valueOf(aob.ra));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.w6));
        hashSet.add(Integer.valueOf(aob.F6));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0(TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            this.r.dismiss();
            this.r = null;
        } catch (Exception e) {
            cc4.g(e, true);
        }
        jj.c0(this.currentAccount, tL_error, this, updatetheme, new Object[0]);
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
            aVar.setTitle(ob6.M0(2131748006, null));
        } else {
            aVar.setTitle(ob6.M0(2131751183, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 20));
        this.c = this.actionBar.u().e(1, ob6.M0(2131751319, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        yob.h(aob.a7, null, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new b02((byte) 29));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.x;
        int i2 = aob.d6;
        yob.h(i2, null, linearLayout4);
        linearLayout2.addView(this.x, tre.o(-1, -2));
        mf5 mf5Var = new mf5(context, 23);
        this.s = mf5Var;
        mf5Var.setText(ob6.M0(2131748951, null));
        this.x.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i3 = aob.H6;
        yob.D(editTextBoldCursor2, i3, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i4 = aob.G6;
        yob.X(editTextBoldCursor3, i4, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.b;
        if (ob6.a0) {
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
        this.b.setHint(ob6.M0(2131743829, null));
        yob.v(this.b, i4, null);
        this.b.setCursorSize(hl.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, tre.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final xqb b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                s7 s7Var;
                byte b = r2;
                xqb xqbVar = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 6) {
                            return false;
                        }
                        hl.t1(xqbVar.b);
                        return true;
                    default:
                        if (i5 != 6 || (s7Var = xqbVar.c) == null) {
                            return false;
                        }
                        s7Var.performClick();
                        return true;
                }
            }
        });
        this.x.addView(new p3c(context, (byte) 1), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.x.addView(linearLayout5, tre.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().N2 + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        yob.D(this.w, i3, null);
        yob.X(this.w, i4, null);
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout5.addView(this.w, tre.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        yob.D(this.a, i3, null);
        yob.X(this.a, i4, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(ob6.M0(2131745229, null));
        yob.v(this.a, i4, null);
        this.a.setCursorSize(hl.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, tre.o(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final xqb b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                s7 s7Var;
                byte b = r2;
                xqb xqbVar = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 6) {
                            return false;
                        }
                        hl.t1(xqbVar.b);
                        return true;
                    default:
                        if (i5 != 6 || (s7Var = xqbVar.c) == null) {
                            return false;
                        }
                        s7Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new nh6(this, (byte) 18));
        if (z) {
            this.a.setOnFocusChangeListener(new ts0(this, (byte) 19));
        }
        ilb ilbVar = new ilb(context);
        this.e = ilbVar;
        int i5 = aob.b7;
        yob.Z(ilbVar, context, 2131231233, i5);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, tre.o(-1, -2));
        ilb ilbVar2 = new ilb(context);
        this.d = ilbVar2;
        ilbVar2.getTextView().setMovementMethod(new dl((byte) 3));
        yob.C(this.d.getTextView(), aob.K6, null);
        ilb ilbVar3 = this.d;
        if (z) {
            ilbVar3.setText(hl.S2(ob6.M0(2131743838, null)));
        } else {
            SpannableStringBuilder S2 = hl.S2(ob6.M0(2131743797, null));
            this.H = S2;
            ilbVar3.setText(S2);
        }
        linearLayout2.addView(this.d, tre.o(-1, -2));
        ilb ilbVar4 = this.d;
        if (z) {
            yob.Z(ilbVar4, context, 2131231232, i5);
            sqb sqbVar = new sqb(context, this.parentLayout, 1);
            this.f = sqbVar;
            linearLayout2.addView(sqbVar, tre.o(-1, -2));
            qmb qmbVar = new qmb(context);
            this.h = qmbVar;
            hf0 L0 = aob.L0(true);
            uob M = yob.M(i2);
            uob M2 = yob.M(aob.i6);
            qmbVar.setBackground(L0);
            yob.j(qmbVar, L0, M, M2, null);
            this.h.b(ob6.M0(2131743454, null), false);
            linearLayout2.addView(this.h, tre.o(-1, -2));
            this.h.setOnClickListener(new jjb(this, context, (byte) 1));
            ilb ilbVar5 = new ilb(context);
            this.n = ilbVar5;
            ilbVar5.setText(hl.S2(ob6.M0(2131743453, null)));
            yob.Z(this.n, context, 2131231233, i5);
            linearLayout2.addView(this.n, tre.o(-1, -2));
        } else {
            yob.Z(ilbVar4, context, 2131231233, i5);
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
            jj.r0(this, ob6.M0(2131743843, null), ob6.M0(2131743830, null), null);
            return;
        }
        boolean z = this.I;
        TLRPC.TL_theme tL_theme = this.L;
        if (z) {
            String str = tL_theme.title;
            id idVar = new id(3, null, getParentActivity());
            this.r = idVar;
            idVar.setOnCancelListener(new Object());
            this.r.show();
            String obj = this.b.getText().toString();
            tL_theme.title = obj;
            znb znbVar = this.J;
            znbVar.a = obj;
            znbVar.G.slug = this.a.getText().toString();
            aob.v1(znbVar, true, true, true);
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
        this.r = new id(3, null, getParentActivity());
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
        int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatetheme, new isa(this, updatetheme, (byte) 15), 2);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
        this.r.setOnCancelListener(new gt0(this, sendRequest, (byte) 9));
        this.r.show();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        id idVar;
        id idVar2;
        int i3 = jn7.M2;
        ynb ynbVar = this.K;
        znb znbVar = this.J;
        if (i == i3) {
            znb znbVar2 = (znb) objArr[0];
            ynb ynbVar2 = (ynb) objArr[1];
            if (znbVar2 == znbVar && ynbVar2 == ynbVar && (idVar2 = this.r) != null) {
                try {
                    idVar2.dismiss();
                    this.r = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                aob.t(znbVar, true, false);
                finishFragment();
            }
        } else if (i == jn7.N2) {
            znb znbVar3 = (znb) objArr[0];
            ynb ynbVar3 = (ynb) objArr[1];
            if (znbVar3 == znbVar && ynbVar3 == ynbVar && (idVar = this.r) != null) {
                try {
                    idVar.dismiss();
                    this.r = null;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
        }
    }

    public final void e0(int i, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ilb ilbVar = this.e;
        boolean z = this.I;
        if (isEmpty) {
            ilbVar.setVisibility(8);
            ilb ilbVar2 = this.d;
            if (z) {
                yob.Z(ilbVar2, getParentActivity(), 2131231232, aob.b7);
                return;
            } else {
                yob.Z(ilbVar2, getParentActivity(), 2131231233, aob.b7);
                return;
            }
        }
        ilbVar.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i));
        this.e.setTextColorByKey(i);
        ilb ilbVar3 = this.d;
        if (z) {
            yob.Z(ilbVar3, getParentActivity(), 2131231234, aob.b7);
        } else {
            ilbVar3.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Vc));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Wc));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ld));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Rb));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Nd));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Tb));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Pd));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ub));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Rd));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Wb));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ee));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.jc));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.fe));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ec));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.M2);
        getNotificationCenter().b(this, jn7.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.M2);
        getNotificationCenter().n(this, jn7.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!uc7.e1().getBoolean("view_animations", true) && this.I) {
            this.a.requestFocus();
            hl.E3(this.a);
        }
        hl.V2(getParentActivity(), this.classGuid);
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                yob.l(editTextBoldCursor, 30, aob.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                yob.l(editTextBoldCursor2, 30, aob.G6, null);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !this.I) {
            this.a.requestFocus();
            hl.E3(this.a);
        }
    }
}
