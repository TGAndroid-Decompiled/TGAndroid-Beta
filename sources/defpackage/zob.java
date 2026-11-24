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
public final class zob extends d implements jm7 {
    public String E;
    public b7b F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final bmb J;
    public final amb K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor a;
    public EditTextBoldCursor b;
    public r7 c;
    public njb d;
    public njb e;
    public uob f;
    public vkb h;
    public njb n;
    public he r;
    public jf5 s;
    public EditTextBoldCursor w;
    public LinearLayout x;
    public int y;

    public zob(bmb bmbVar, amb ambVar, boolean z) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i;
        this.J = bmbVar;
        this.K = ambVar;
        if (ambVar != null) {
            tL_theme = ambVar.r;
        } else {
            tL_theme = bmbVar.G;
        }
        this.L = tL_theme;
        if (ambVar != null) {
            i = ambVar.t;
        } else {
            i = bmbVar.F;
        }
        this.currentAccount = i;
        this.I = z;
    }

    public final boolean Z(String str, boolean z) {
        b7b b7bVar = this.F;
        if (b7bVar != null) {
            gm.r(b7bVar);
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
                            ik.r0(this, jb6.M0(2131743875, null), jb6.M0(2131745236, null), null);
                            return false;
                        }
                        f0(cmb.o7, jb6.M0(2131745236, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z) {
                            ik.r0(this, jb6.M0(2131743875, null), jb6.M0(2131745239, null), null);
                            return false;
                        }
                        f0(cmb.o7, jb6.M0(2131745239, null));
                        return false;
                    }
                }
            } else {
                f0(cmb.o7, jb6.M0(2131745239, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z) {
                    ik.r0(this, jb6.M0(2131743875, null), jb6.M0(2131745238, null), null);
                    return false;
                }
                f0(cmb.o7, jb6.M0(2131745238, null));
                return false;
            }
            if (!z) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(cmb.v6, jb6.a0("SetUrlAvailable", null, 2131745242, str));
                    return true;
                }
                f0(cmb.E6, jb6.M0(2131745241, null));
                this.E = str;
                b7b b7bVar2 = new b7b(this, str, (byte) 13);
                this.F = b7bVar2;
                gm.d3(b7bVar2, 300L);
            }
            return true;
        } else if (z) {
            ik.r0(this, jb6.M0(2131743875, null), jb6.M0(2131745237, null), null);
            return false;
        } else {
            f0(cmb.o7, jb6.M0(2131745237, null));
            return false;
        }
    }

    public final void a0(String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(createtheme, new ara(this, str, (byte) 13), 2);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.id));
        hashSet.add(Integer.valueOf(cmb.Cb));
        hashSet.add(Integer.valueOf(cmb.Bb));
        hashSet.add(Integer.valueOf(cmb.Ab));
        hashSet.add(Integer.valueOf(cmb.zb));
        hashSet.add(Integer.valueOf(cmb.sb));
        hashSet.add(Integer.valueOf(cmb.rb));
        hashSet.add(Integer.valueOf(cmb.vb));
        hashSet.add(Integer.valueOf(cmb.ub));
        hashSet.add(Integer.valueOf(cmb.tb));
        hashSet.add(Integer.valueOf(cmb.qb));
        hashSet.add(Integer.valueOf(cmb.sa));
        hashSet.add(Integer.valueOf(cmb.Tc));
        hashSet.add(Integer.valueOf(cmb.qa));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.v6));
        hashSet.add(Integer.valueOf(cmb.E6));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void b0(TLRPC.TL_theme tL_theme) {
        try {
            this.r.dismiss();
            this.r = null;
        } catch (Exception e) {
            fc4.g(e, true);
        }
        cmb.G1(this.J, this.K, tL_theme, this.currentAccount, false);
        finishFragment();
    }

    public final void c0(TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            this.r.dismiss();
            this.r = null;
        } catch (Exception e) {
            fc4.g(e, true);
        }
        ik.c0(this.currentAccount, tL_error, this, updatetheme, new Object[0]);
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setAllowOverlayTitle(true);
        a aVar = this.actionBar;
        boolean z = this.I;
        if (z) {
            aVar.setTitle(jb6.M0(2131748009, null));
        } else {
            aVar.setTitle(jb6.M0(2131751155, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 19));
        this.c = this.actionBar.t().e(1, jb6.M0(2131751291, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        anb.h(cmb.Z6, null, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new w02((byte) 29));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.x;
        int i2 = cmb.c6;
        anb.h(i2, null, linearLayout4);
        linearLayout2.addView(this.x, qoe.o(-1, -2));
        jf5 jf5Var = new jf5(context, 23);
        this.s = jf5Var;
        jf5Var.setText(jb6.M0(2131748954, null));
        this.x.addView(this.s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.b;
        int i3 = cmb.G6;
        anb.D(editTextBoldCursor2, i3, null);
        EditTextBoldCursor editTextBoldCursor3 = this.b;
        int i4 = cmb.F6;
        anb.X(editTextBoldCursor3, i4, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.b;
        if (jb6.a0) {
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
        this.b.setHint(jb6.M0(2131743861, null));
        anb.v(this.b, i4, null);
        this.b.setCursorSize(gm.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.x.addView(this.b, qoe.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final zob b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                r7 r7Var;
                byte b = r2;
                zob zobVar = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 6) {
                            return false;
                        }
                        gm.t1(zobVar.b);
                        return true;
                    default:
                        if (i5 != 6 || (r7Var = zobVar.c) == null) {
                            return false;
                        }
                        r7Var.performClick();
                        return true;
                }
            }
        });
        this.x.addView(new q1c(context, (byte) 1), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.x.addView(linearLayout5, qoe.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().N2 + "/addtheme/");
        this.w.setTextSize(1, 18.0f);
        anb.D(this.w, i3, null);
        anb.X(this.w, i4, null);
        this.w.setMaxLines(1);
        this.w.setLines(1);
        this.w.setEnabled(false);
        this.w.setBackgroundDrawable(null);
        this.w.setPadding(0, 0, 0, 0);
        this.w.setSingleLine(true);
        this.w.setInputType(163840);
        this.w.setImeOptions(6);
        linearLayout5.addView(this.w, qoe.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        anb.D(this.a, i3, null);
        anb.X(this.a, i4, null);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setBackgroundDrawable(null);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setSingleLine(true);
        this.a.setInputType(163872);
        this.a.setImeOptions(6);
        this.a.setHint(jb6.M0(2131745235, null));
        anb.v(this.a, i4, null);
        this.a.setCursorSize(gm.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout5.addView(this.a, qoe.o(-1, 50));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final zob b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                r7 r7Var;
                byte b = r2;
                zob zobVar = this.b;
                switch (b) {
                    case 0:
                        if (i5 != 6) {
                            return false;
                        }
                        gm.t1(zobVar.b);
                        return true;
                    default:
                        if (i5 != 6 || (r7Var = zobVar.c) == null) {
                            return false;
                        }
                        r7Var.performClick();
                        return true;
                }
            }
        });
        this.a.addTextChangedListener(new og6(this, (byte) 18));
        if (z) {
            this.a.setOnFocusChangeListener(new tt0(this, (byte) 18));
        }
        njb njbVar = new njb(context);
        this.e = njbVar;
        int i5 = cmb.a7;
        anb.Z(njbVar, context, 2131231234, i5);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, qoe.o(-1, -2));
        njb njbVar2 = new njb(context);
        this.d = njbVar2;
        njbVar2.getTextView().setMovementMethod(new cm((byte) 3));
        anb.C(this.d.getTextView(), cmb.J6, null);
        njb njbVar3 = this.d;
        if (z) {
            njbVar3.setText(gm.S2(jb6.M0(2131743870, null)));
        } else {
            SpannableStringBuilder S2 = gm.S2(jb6.M0(2131743829, null));
            this.H = S2;
            njbVar3.setText(S2);
        }
        linearLayout2.addView(this.d, qoe.o(-1, -2));
        njb njbVar4 = this.d;
        if (z) {
            anb.Z(njbVar4, context, 2131231233, i5);
            uob uobVar = new uob(context, this.parentLayout, 1);
            this.f = uobVar;
            linearLayout2.addView(uobVar, qoe.o(-1, -2));
            vkb vkbVar = new vkb(context);
            this.h = vkbVar;
            fg0 L0 = cmb.L0(true);
            wmb M = anb.M(i2);
            wmb M2 = anb.M(cmb.h6);
            vkbVar.setBackground(L0);
            anb.j(vkbVar, L0, M, M2, null);
            this.h.b(jb6.M0(2131743486, null), false);
            linearLayout2.addView(this.h, qoe.o(-1, -2));
            this.h.setOnClickListener(new r39(this, context, (byte) 29));
            njb njbVar5 = new njb(context);
            this.n = njbVar5;
            njbVar5.setText(gm.S2(jb6.M0(2131743485, null)));
            anb.Z(this.n, context, 2131231234, i5);
            linearLayout2.addView(this.n, qoe.o(-1, -2));
        } else {
            anb.Z(njbVar4, context, 2131231234, i5);
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

    public final void d0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        he heVar;
        he heVar2;
        int i3 = nm7.M2;
        amb ambVar = this.K;
        bmb bmbVar = this.J;
        if (i == i3) {
            bmb bmbVar2 = (bmb) objArr[0];
            amb ambVar2 = (amb) objArr[1];
            if (bmbVar2 == bmbVar && ambVar2 == ambVar && (heVar2 = this.r) != null) {
                try {
                    heVar2.dismiss();
                    this.r = null;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                cmb.t(bmbVar, true, false);
                finishFragment();
            }
        } else if (i == nm7.N2) {
            bmb bmbVar3 = (bmb) objArr[0];
            amb ambVar3 = (amb) objArr[1];
            if (bmbVar3 == bmbVar && ambVar3 == ambVar && (heVar = this.r) != null) {
                try {
                    heVar.dismiss();
                    this.r = null;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
        }
    }

    public final void e0() {
        if (!Z(this.a.getText().toString(), true) || getParentActivity() == null) {
            return;
        }
        if (this.b.length() == 0) {
            ik.r0(this, jb6.M0(2131743875, null), jb6.M0(2131743862, null), null);
            return;
        }
        boolean z = this.I;
        TLRPC.TL_theme tL_theme = this.L;
        if (z) {
            String str = tL_theme.title;
            he heVar = new he(3, null, getParentActivity());
            this.r = heVar;
            heVar.setOnCancelListener(new Object());
            this.r.show();
            String obj = this.b.getText().toString();
            tL_theme.title = obj;
            bmb bmbVar = this.J;
            bmbVar.a = obj;
            bmbVar.G.slug = this.a.getText().toString();
            cmb.v1(bmbVar, true, true, true);
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
        this.r = new he(3, null, getParentActivity());
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
        int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatetheme, new ara(this, updatetheme, (byte) 14), 2);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
        this.r.setOnCancelListener(new fu0(this, sendRequest, (byte) 9));
        this.r.show();
    }

    public final void f0(int i, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        njb njbVar = this.e;
        boolean z = this.I;
        if (isEmpty) {
            njbVar.setVisibility(8);
            njb njbVar2 = this.d;
            if (z) {
                anb.Z(njbVar2, getParentActivity(), 2131231233, cmb.a7);
                return;
            } else {
                anb.Z(njbVar2, getParentActivity(), 2131231234, cmb.a7);
                return;
            }
        }
        njbVar.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i));
        this.e.setTextColorByKey(i);
        njb njbVar3 = this.d;
        if (z) {
            anb.Z(njbVar3, getParentActivity(), 2131231235, cmb.a7);
        } else {
            njbVar3.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Uc));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vc));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Kd));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qb));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Md));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sb));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Od));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Tb));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qd));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vb));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.de));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ic));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ee));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.dc));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.M2);
        getNotificationCenter().b(this, nm7.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.M2);
        getNotificationCenter().n(this, nm7.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!oc7.d1().getBoolean("view_animations", true) && this.I) {
            this.a.requestFocus();
            gm.E3(this.a);
        }
        gm.V2(getParentActivity(), this.classGuid);
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.b;
            if (editTextBoldCursor != null) {
                anb.l(editTextBoldCursor, 30, cmb.F6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a;
            if (editTextBoldCursor2 != null) {
                anb.l(editTextBoldCursor2, 30, cmb.F6, null);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !this.I) {
            this.a.requestFocus();
            gm.E3(this.a);
        }
    }
}
