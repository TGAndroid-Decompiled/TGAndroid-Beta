package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public class xt3 extends EditTextBoldCursor implements km4 {
    public static final int[] e2 = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public String N1;
    public StaticLayout O1;
    public pkb P1;
    public int Q1;
    public int R1;
    public int S1;
    public int T1;
    public vt3 U1;
    public int V1;
    public int W1;
    public boolean X1;
    public int Y1;
    public boolean Z1;
    public final vnb a2;
    public int b2;
    public id c2;
    public boolean d2;

    public xt3(Context context, vnb vnbVar) {
        super(context);
        this.V1 = -1;
        this.W1 = -1;
        this.a2 = vnbVar;
        int v0 = aob.v0(aob.Jd, vnbVar);
        this.b2 = v0;
        this.E = v0;
        addTextChangedListener(new c7(this, (byte) 18));
        setClipToPadding(true);
    }

    public final void A(smb smbVar) {
        int selectionEnd;
        int i = this.V1;
        if (i >= 0 && (selectionEnd = this.W1) >= 0) {
            this.W1 = -1;
            this.V1 = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        ls6.f(smbVar, i, selectionEnd, getText(), this.X1);
        if (smbVar == null) {
            Editable text = getText();
            for (jk2 jk2Var : (jk2[]) text.getSpans(i, selectionEnd, jk2.class)) {
                text.removeSpan(jk2Var);
            }
            r19[] r19VarArr = (r19[]) text.getSpans(i, selectionEnd, r19.class);
            for (int i2 = 0; i2 < r19VarArr.length; i2++) {
                text.removeSpan(r19VarArr[i2]);
                text.removeSpan(r19VarArr[i2].s);
                zk zkVar = r19VarArr[i2].w;
                if (zkVar != null) {
                    text.removeSpan(zkVar);
                }
            }
            if (r19VarArr.length > 0) {
                g(true);
            }
        }
        vt3 vt3Var = this.U1;
        if (vt3Var != null) {
            vt3Var.c();
        }
    }

    public h8c B(String str) {
        return new h8c(str, null);
    }

    public final void C() {
        int selectionEnd;
        int w0;
        int w02;
        int i = this.V1;
        if (i >= 0 && (selectionEnd = this.W1) >= 0) {
            this.W1 = -1;
            this.V1 = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        wr3 wr3Var = new wr3(i, selectionEnd, this);
        kc kcVar = new kc((byte) 10);
        Pattern pattern = jj.a;
        if (context == null) {
            return;
        }
        vnb vnbVar = this.a2;
        int i2 = aob.j5;
        if (vnbVar != null) {
            w0 = vnbVar.f(i2);
            w02 = vnbVar.f(aob.h5);
            vnbVar.f(aob.Aj);
            vnbVar.f(aob.Ej);
            vnbVar.f(aob.E8);
            vnbVar.f(aob.G8);
            vnbVar.f(aob.i6);
            vnbVar.f(aob.Ji);
            vnbVar.f(aob.Fi);
            vnbVar.f(aob.Hi);
        } else {
            w0 = aob.w0(null, i2, false);
            w02 = aob.w0(null, aob.h5, false);
            aob.w0(null, aob.Aj, false);
            aob.w0(null, aob.Ej, false);
            aob.w0(null, aob.E8, false);
            aob.w0(null, aob.G8, false);
            aob.w0(null, aob.i6, false);
            aob.w0(null, aob.Ji, false);
            aob.w0(null, aob.Fi, false);
            aob.w0(null, aob.Hi, false);
        }
        int i3 = w0;
        int i4 = w02;
        z8d z8dVar = new z8d(context, vnbVar);
        ((nx0) z8dVar.b).w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i5 = calendar.get(1);
        hq7 hq7Var = new hq7(context, vnbVar);
        hq7Var.setTextColor(i3);
        hq7Var.setTextOffset(hl.L(10.0f));
        hq7Var.setItemCount(5);
        hq7Var.setMinValue(1);
        hq7Var.setMaxValue(31);
        hq7Var.setWrapSelectorWheel(false);
        hq7Var.setFormatter(new bg((byte) 14));
        hq7 hq7Var2 = new hq7(context, vnbVar);
        hq7Var2.setTextColor(i3);
        hq7Var2.setTextOffset(-hl.L(10.0f));
        hq7Var2.setItemCount(5);
        hq7Var2.setMinValue(0);
        hq7Var2.setMaxValue(239);
        hq7Var2.setValue(120);
        hq7Var2.setWrapSelectorWheel(false);
        hq7Var2.setFormatter(new wg(calendar, i5, (byte) 0));
        hq7 hq7Var3 = new hq7(context, vnbVar);
        hq7Var3.setContentDescriptionCallback(new sb((byte) 1));
        hq7Var3.setWrapSelectorWheel(true);
        hq7Var3.setAllItemsCount(24);
        hq7Var3.setItemCount(5);
        hq7Var3.setTextColor(i3);
        hq7Var3.setTextOffset(hl.L(10.0f));
        hq7Var3.setMinValue(0);
        hq7Var3.setMaxValue(23);
        hq7Var3.setFormatter(new bg((byte) 15));
        hq7 hq7Var4 = new hq7(context, vnbVar);
        hq7Var4.setContentDescriptionCallback(new sb((byte) 2));
        hq7Var4.setWrapSelectorWheel(true);
        hq7Var4.setAllItemsCount(60);
        hq7Var4.setItemCount(5);
        hq7Var4.setTextColor(i3);
        hq7Var4.setTextOffset(-hl.L(10.0f));
        hq7Var4.setMinValue(0);
        hq7Var4.setMaxValue(59);
        hq7Var4.setValue(0);
        hq7Var4.setFormatter(new bg((byte) 16));
        calendar.setTimeInMillis(currentTimeMillis);
        hq7Var4.setValue(calendar.get(12));
        hq7Var3.setValue(calendar.get(11));
        hq7Var.setValue(calendar.get(5));
        hq7Var2.setValue(calendar.get(2) + 120);
        pkb pkbVar = new pkb(ob6.a0(null, null, 2131742414, "", "").trim(), 16.0f, null);
        pkbVar.o(hl.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pkbVar.a();
        pkbVar.l(1);
        pkbVar.m(i3);
        pkb pkbVar2 = new pkb(":", 18.0f, null);
        pkbVar2.o(hl.L(100.0f));
        pkbVar2.a();
        pkbVar2.l(1);
        pkbVar2.a.setColor(i3);
        FrameLayout frameLayout = new FrameLayout(context);
        ki kiVar = new ki(context, hq7Var2, hq7Var, hq7Var3, hq7Var4);
        kiVar.setOrientation(1);
        frameLayout.addView(kiVar, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        kiVar.addView(frameLayout2, tre.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131746063, null));
        textView.setTextColor(i3);
        bs2.t(textView, 1, 20.0f);
        frameLayout2.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new q8((byte) 11));
        g7 g7Var = new g7(context, pkbVar2, hq7Var4);
        g7Var.setOrientation(0);
        g7Var.setWeightSum(1.0f);
        kiVar.addView(g7Var, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        c51 c51Var = new c51(vnbVar, context, true);
        xg xgVar = new xg(c51Var, hq7Var, hq7Var2, hq7Var3, hq7Var4);
        g7Var.addView(hq7Var, tre.l(0.2f, 0, 270));
        g7Var.addView(hq7Var2, tre.l(0.4f, 0, 270));
        g7Var.addView(hq7Var3, tre.l(0.2f, 0, 270));
        g7Var.addView(hq7Var4, tre.l(0.2f, 0, 270));
        hq7Var.setOnValueChangedListener(xgVar);
        hq7Var2.setOnValueChangedListener(xgVar);
        hq7Var3.setOnValueChangedListener(xgVar);
        hq7Var4.setOnValueChangedListener(xgVar);
        boolean[] zArr = {true};
        c51Var.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        c51Var.f();
        kiVar.addView(c51Var, tre.t(-1, 48, 83, 16, 15, 16, 16));
        c51Var.setOnClickListener(new yg(zArr, hq7Var, hq7Var2, hq7Var3, hq7Var4, wr3Var, new int[1], z8dVar));
        nx0 nx0Var = (nx0) z8dVar.b;
        nx0Var.O = frameLayout;
        nx0Var.show();
        nx0Var.setOnDismissListener(new h5(kcVar, zArr, (byte) 4));
        nx0Var.s0(i4);
        nx0Var.K(i4);
        jj.c(c51Var, hq7Var, hq7Var2, hq7Var3, hq7Var4);
    }

    public final void D(m72 m72Var) {
        int selectionEnd;
        int i = this.V1;
        if (i >= 0 && (selectionEnd = this.W1) >= 0) {
            this.W1 = -1;
            this.V1 = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        I(ob6.M0(2131751709, null), ob6.M0(2131743572, null), "http://", true, this.d2, new ez0(this, i, selectionEnd, m72Var));
    }

    public final boolean H(int i) {
        int selectionEnd;
        vnb vnbVar;
        int selectionEnd2;
        if (i == 2131296505) {
            A(null);
            return true;
        } else if (i == 2131296493) {
            ?? obj = new Object();
            obj.a |= 1;
            A(new smb(obj, 0));
            return true;
        } else if (i == 2131296499) {
            ?? obj2 = new Object();
            obj2.a |= 2;
            A(new smb(obj2, 0));
            return true;
        } else if (i == 2131296501) {
            ?? obj3 = new Object();
            obj3.a |= 4;
            A(new smb(obj3, 0));
            return true;
        } else if (i == 2131296500) {
            D(null);
            return true;
        } else if (i == 2131296511) {
            ?? obj4 = new Object();
            obj4.a |= 8;
            A(new smb(obj4, 0));
            return true;
        } else if (i == 2131296514) {
            ?? obj5 = new Object();
            obj5.a |= 16;
            A(new smb(obj5, 0));
            return true;
        } else if (i == 2131296510) {
            ?? obj6 = new Object();
            obj6.a |= 256;
            A(new smb(obj6, 0));
            h();
            return true;
        } else if (i == 2131296504) {
            int i2 = this.V1;
            if (i2 >= 0 && (selectionEnd2 = this.W1) >= 0) {
                this.W1 = -1;
                this.V1 = -1;
            } else {
                i2 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            }
            int c = r19.c(getText(), i2, selectionEnd2, false);
            if (c >= 0) {
                setSelection(c);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        } else if (i == 2131296495) {
            C();
            return true;
        } else if (i != 2131296513) {
            return false;
        } else {
            int i3 = this.V1;
            if (i3 >= 0 && (selectionEnd = this.W1) >= 0) {
                this.W1 = -1;
                this.V1 = -1;
            } else {
                i3 = getSelectionStart();
                selectionEnd = getSelectionEnd();
            }
            CharSequence subSequence = getText().subSequence(i3, selectionEnd);
            e S = LaunchActivity.S();
            Context context = getContext();
            if (S != null) {
                vnbVar = S.getResourceProvider();
            } else {
                vnbVar = null;
            }
            ?? ny0Var = new ny0(context, null, false, false, 2, vnbVar);
            vnb vnbVar2 = vnbVar;
            ny0Var.b2 = 1;
            ny0Var.c2 = new String[]{"formal", "neutral", "casual"};
            ny0Var.d2 = new String[]{"Formal", "Neutral", "Casual"};
            ny0Var.f2 = true;
            ny0Var.g2 = -1;
            ImageView imageView = new ImageView(context);
            ny0Var.S1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231272);
            int i4 = aob.G6;
            yob.s(imageView, i4, vnbVar2, PorterDuff.Mode.SRC_ATOP);
            hf0 f0 = aob.f0(aob.p1(0.1f, aob.v0(i4, ny0Var.J0)), 1, -1);
            uob K = yob.K(0.1f, i4);
            imageView.setBackground(f0);
            yob.j(imageView, f0, null, K, vnbVar2);
            ny0Var.o1.addView(imageView, tre.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            iye.b(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new t3c(ny0Var, (byte) 2));
            String H0 = r3c.H0();
            ny0Var.a2 = H0;
            if (H0 == null) {
                ny0Var.a2 = a5c.i();
            }
            ny0Var.F1 = false;
            ny0Var.E1 = hl.L(12.0f);
            int i5 = aob.a7;
            ny0Var.s0(aob.v0(i5, ny0Var.J0));
            FrameLayout frameLayout = new FrameLayout(context);
            ny0Var.T1 = frameLayout;
            frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, aob.v0(i5, ny0Var.J0)), aob.v0(i5, ny0Var.J0), aob.v0(i5, ny0Var.J0)}));
            c51 c51Var = new c51(vnbVar2, context, true);
            c51Var.setRoundRadius(24);
            ny0Var.U1 = c51Var;
            c51Var.setText(ob6.M0(2131747558, null));
            FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
            int i6 = d.leftMargin;
            int i7 = ny0Var.u0;
            d.leftMargin = i6 + i7;
            d.rightMargin += i7;
            frameLayout.addView(c51Var, d);
            ny0Var.b.addView(frameLayout, tre.e(-1, -2, 80));
            int i8 = ny0Var.u0;
            int L = hl.L(66.0f);
            d79 d79Var = ny0Var.n1;
            d79Var.setPadding(i8, 0, i8, L);
            d79Var.setClipToPadding(false);
            d79Var.s1();
            d79Var.setOnItemClickListener(new l0(ny0Var, vnbVar2, (byte) 23));
            zb3 zb3Var = new zb3();
            zb3Var.m = false;
            zb3Var.C = false;
            zb3Var.o(k43.h);
            zb3Var.n(350L);
            d79Var.setItemAnimator(zb3Var);
            ny0Var.e2.O(false);
            ny0Var.V1 = subSequence;
            xqe.b(subSequence.toString(), new ftb(ny0Var, (byte) 2), new grb((byte) 8), false);
            ny0Var.Y1 = new st3(this, i3, selectionEnd);
            ny0Var.show();
            setSelection(i3, selectionEnd);
            return true;
        }
    }

    public final void I(String str, String str2, String str3, boolean z, boolean z2, wt3 wt3Var) {
        AlertDialog$Builder alertDialog$Builder;
        String str4;
        int i;
        CharSequence charSequence;
        vnb vnbVar = this.a2;
        if (z2) {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, getContext());
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, getContext());
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        id idVar = alertDialog$Builder2.a;
        idVar.S = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final xs0 xs0Var = new xs0(getContext(), (byte) 3);
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        xs0Var.setTextSize(1, 18.0f);
        xs0Var.setText(str4);
        yob.X(xs0Var, aob.j5, vnbVar);
        xs0Var.setHintText(str2);
        yob.l(xs0Var, 35, aob.L6, vnbVar);
        xs0Var.setSingleLine(true);
        xs0Var.setFocusable(true);
        xs0Var.setTransformHintToHeader(true);
        yob.F(xs0Var, aob.k6, aob.l6, aob.p7, vnbVar);
        xs0Var.setImeOptions(6);
        xs0Var.setBackgroundDrawable(null);
        xs0Var.requestFocus();
        xs0Var.setPadding(0, 0, 0, 0);
        yob.C(xs0Var, aob.lg, vnbVar);
        yob.l(xs0Var, 36, aob.mg, vnbVar);
        frameLayout.addView(xs0Var, tre.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131747162, null));
        textView.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        textView.setGravity(17);
        int i2 = aob.o6;
        int v0 = aob.v0(i2, vnbVar);
        yob.X(textView, i2, vnbVar);
        int L = hl.L(6.0f);
        int p1 = aob.p1(0.12f, v0);
        int p12 = aob.p1(0.15f, v0);
        hf0 i0 = aob.i0(L, L, L, L, p1, p12, p12);
        uob K = yob.K(0.12f, i2);
        uob K2 = yob.K(0.15f, i2);
        textView.setBackground(i0);
        yob.j(textView, i0, K, K2, vnbVar);
        iye.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, tre.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        va7 va7Var = new va7(this, z, xs0Var, str4, textView, (byte) 10);
        textView.setOnClickListener(new c0(this, xs0Var, va7Var, (byte) 27));
        xs0Var.addTextChangedListener(new c7(va7Var, (byte) 19));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                cc4.g(e, true);
                charSequence = null;
            }
            if (charSequence != null) {
                xs0Var.setText(charSequence);
                xs0Var.setSelection(0, xs0Var.getText().length());
            }
        }
        va7Var.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.j(ob6.M0(2131747558, null), new q72(wt3Var, xs0Var, (byte) 28));
        alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
        if (z2) {
            this.c2 = idVar;
            idVar.setOnDismissListener(new o1(this, (byte) 18));
            this.c2.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    xs0 xs0Var2 = xs0Var;
                    switch (b) {
                        case 0:
                            xs0Var2.requestFocus();
                            hl.E3(xs0Var2);
                            return;
                        default:
                            xs0Var2.requestFocus();
                            hl.E3(xs0Var2);
                            return;
                    }
                }
            });
            this.c2.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    xs0 xs0Var2 = xs0Var;
                    switch (b) {
                        case 0:
                            xs0Var2.requestFocus();
                            hl.E3(xs0Var2);
                            return;
                        default:
                            xs0Var2.requestFocus();
                            hl.E3(xs0Var2);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xs0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L2 = hl.L(24.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.height = hl.L(36.0f);
            xs0Var.setLayoutParams(marginLayoutParams);
        }
        xs0Var.setSelection(0, xs0Var.getText().length());
    }

    public void a(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text != null && i2 >= 0 && i3 >= 0 && i2 < i3 && i2 < (min = Math.min(i3, text.length()))) {
            ?? obj = new Object();
            obj.a = i;
            ls6.f(new smb(obj, 0), i2, min, text, true);
            if ((i & 256) != 0) {
                h();
            }
            vt3 vt3Var = this.U1;
            if (vt3Var != null) {
                vt3Var.c();
            }
        }
    }

    public void b(int i, int i2, int i3) {
        smb[] smbVarArr;
        Editable text = getText();
        if (text != null && i2 >= 0 && i3 >= 0 && i2 < i3) {
            int min = Math.min(i3, text.length());
            int i4 = i & 256;
            if (i4 != 0) {
                i |= 512;
            }
            for (smb smbVar : (smb[]) text.getSpans(i2, min, smb.class)) {
                rmb rmbVar = smbVar.b;
                int i5 = rmbVar.a;
                if ((i5 & i) != 0) {
                    int spanStart = text.getSpanStart(smbVar);
                    int spanEnd = text.getSpanEnd(smbVar);
                    text.removeSpan(smbVar);
                    if (spanStart < i2) {
                        text.setSpan(new smb(new rmb(rmbVar), 0), spanStart, i2, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new smb(new rmb(rmbVar), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i2);
                    int min2 = Math.min(spanEnd, min);
                    int i6 = i5 & (~i);
                    if (i6 != 0 && max < min2) {
                        rmb rmbVar2 = new rmb(rmbVar);
                        rmbVar2.a = i6;
                        text.setSpan(new smb(rmbVar2, 0), max, min2, 33);
                    }
                }
            }
            if (i4 != 0) {
                h();
            }
            vt3 vt3Var = this.U1;
            if (vt3Var != null) {
                vt3Var.c();
            }
        }
    }

    public int c(int i, int i2) {
        Editable text = getText();
        if (text != null) {
            int max = Math.max(0, i);
            int min = Math.min(i2, text.length());
            if (max >= 0 && min >= 0 && max < min) {
                smb[] smbVarArr = (smb[]) text.getSpans(max, min, smb.class);
                int i3 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    int i5 = e2[i4];
                    int i6 = max;
                    boolean z = true;
                    while (z && i6 < min) {
                        z = false;
                        for (int i7 = 0; i7 < smbVarArr.length; i7++) {
                            smb smbVar = smbVarArr[i7];
                            int i8 = smbVar.b.a;
                            if ((i8 & 512) != 0) {
                                i8 |= 256;
                            }
                            if ((i8 & i5) != 0) {
                                int spanStart = text.getSpanStart(smbVar);
                                int spanEnd = text.getSpanEnd(smbVarArr[i7]);
                                if (spanStart <= i6 && spanEnd > i6) {
                                    z = true;
                                    i6 = spanEnd;
                                }
                            }
                        }
                    }
                    if (i6 >= min) {
                        i3 |= i5;
                    }
                }
                return i3;
            }
        }
        return 0;
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.X1;
    }

    public String getCaption() {
        return this.N1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.E == this.b2) {
            int v0 = aob.v0(aob.Jd, this.a2);
            this.b2 = v0;
            this.E = v0;
        }
        canvas.save();
        canvas.translate(0.0f, this.P);
        super.onDraw(canvas);
        try {
            if (this.O1 != null && this.Q1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.T1);
                canvas.save();
                canvas.translate(this.R1, this.S1);
                this.O1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (this.P1 != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            canvas2 = canvas;
            this.P1.c(layout.getLineRight(0), (getHeight() / 2.0f) + hl.L(1.0f), 1.0f, this.T1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        v4 v4Var = new v4(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.N1)) {
            v4Var.l(this.N1);
        }
        ArrayList d = v4Var.d();
        int size = d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            s4 s4Var = (s4) d.get(i);
            if (s4Var.a() == 268435456) {
                v4Var.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) s4Var.a);
                break;
            }
            i++;
        }
        if (hasSelection()) {
            v4Var.b(new s4(2131296510, ob6.M0(2131744919, null)));
            v4Var.b(new s4(2131296493, ob6.M0(2131753664, null)));
            v4Var.b(new s4(2131296499, ob6.M0(2131748841, null)));
            v4Var.b(new s4(2131296501, ob6.M0(2131748104, null)));
            v4Var.b(new s4(2131296511, ob6.M0(2131744090, null)));
            v4Var.b(new s4(2131296514, ob6.M0(2131743544, null)));
            v4Var.b(new s4(2131296500, ob6.M0(2131751709, null)));
            v4Var.b(new s4(2131296505, ob6.M0(2131746064, null)));
            v4Var.b(new s4(2131296495, ob6.M0(2131750550, null)));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int indexOf;
        int i3;
        boolean z;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.Z1 = z;
            super.onMeasure(i, i2);
            if (this.Z1) {
                this.Y1 = getLineCount();
            }
            this.Z1 = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(51.0f));
            cc4.g(e, true);
        }
        this.O1 = null;
        String str = this.N1;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                CharSequence subSequence = text.subSequence(0, indexOf + 1);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i3));
                this.Q1 = subSequence.length();
                int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
                CharSequence ellipsize = TextUtils.ellipsize(this.N1, paint, measuredWidth, TextUtils.TruncateAt.END);
                this.R1 = ceil;
                try {
                    StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.O1 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        this.R1 = (int) (this.R1 + (-this.O1.getLineLeft(0)));
                    }
                    this.S1 = ((getMeasuredHeight() - this.O1.getLineBottom(0)) / 2) + hl.L(0.5f);
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hx2.a(primaryClip.getItemAt(0).getHtmlText()));
                    pv3.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class);
                    if (hmVarArr != null) {
                        for (hm hmVar : hmVarArr) {
                            hmVar.applyFontMetrics(getPaint().getFontMetricsInt(), wl.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    q19[] q19VarArr = (q19[]) getText().getSpans(max, min, q19.class);
                    if (q19VarArr != null && q19VarArr.length > 0) {
                        q19[] q19VarArr2 = (q19[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q19.class);
                        for (int i2 = 0; i2 < q19VarArr2.length; i2++) {
                            spannableStringBuilder.removeSpan(q19VarArr2[i2]);
                            spannableStringBuilder.removeSpan(q19VarArr2[i2].a);
                        }
                    } else {
                        r19.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } else {
            try {
                if (i == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    hl.g(getText().subSequence(max2, min2));
                    hl.W(getContext()).closeContextMenu();
                    cl4 cl4Var = this.Z0;
                    if (cl4Var != null) {
                        cl4Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                } else if (i == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    hl.g(getText().subSequence(max3, min3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (max3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, max3));
                    }
                    if (min3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(min3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(max3, max3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!H(i) && !super.performAccessibilityAction(i, bundle)) {
            return false;
        }
        return true;
    }

    public void setAllowTextEntitiesIntersection(boolean z) {
        this.X1 = z;
    }

    public void setCaption(String str) {
        String str2 = this.N1;
        if ((str2 != null && str2.length() != 0) || (str != null && str.length() != 0)) {
            String str3 = this.N1;
            if (str3 == null || !str3.equals(str)) {
                this.N1 = str;
                if (str != null) {
                    this.N1 = str.replace('\n', ' ');
                }
                requestLayout();
            }
        }
    }

    public void setDelegate(vt3 vt3Var) {
        this.U1 = vt3Var;
    }

    @Override
    public void setHintColor(int i) {
        super.setHintColor(i);
        this.T1 = i;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.P1 = new pkb(charSequence, 16.0f, getTypeface());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new rt3(new ut3(this, callback), callback, (byte) 1));
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return super.startActionMode(new rt3(new ut3(this, callback), callback, (byte) 1), i);
    }

    public void E() {
    }

    public void F() {
    }

    public void G(int i, int i2) {
    }
}
