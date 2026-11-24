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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public class gt3 extends EditTextBoldCursor implements fk4 {
    public static final int[] d2 = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public String M1;
    public StaticLayout N1;
    public tgb O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public et3 T1;
    public int U1;
    public int V1;
    public boolean W1;
    public int X1;
    public boolean Y1;
    public final wjb Z1;
    public int a2;
    public hd b2;
    public boolean c2;

    public gt3(Context context, wjb wjbVar) {
        super(context);
        this.U1 = -1;
        this.V1 = -1;
        this.Z1 = wjbVar;
        int v0 = bkb.v0(bkb.Id, wjbVar);
        this.a2 = v0;
        this.E = v0;
        addTextChangedListener(new b7(this, (byte) 18));
        setClipToPadding(true);
    }

    public final void A(wib wibVar) {
        int selectionEnd;
        int i = this.U1;
        if (i >= 0 && (selectionEnd = this.V1) >= 0) {
            this.V1 = -1;
            this.U1 = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        hq6.f(wibVar, i, selectionEnd, getText(), this.W1);
        if (wibVar == null) {
            Editable text = getText();
            for (nj2 nj2Var : (nj2[]) text.getSpans(i, selectionEnd, nj2.class)) {
                text.removeSpan(nj2Var);
            }
            ey8[] ey8VarArr = (ey8[]) text.getSpans(i, selectionEnd, ey8.class);
            for (int i2 = 0; i2 < ey8VarArr.length; i2++) {
                text.removeSpan(ey8VarArr[i2]);
                text.removeSpan(ey8VarArr[i2].s);
                yk ykVar = ey8VarArr[i2].w;
                if (ykVar != null) {
                    text.removeSpan(ykVar);
                }
            }
            if (ey8VarArr.length > 0) {
                g(true);
            }
        }
        et3 et3Var = this.T1;
        if (et3Var != null) {
            et3Var.m();
        }
    }

    public i4c B(String str) {
        return new i4c(str, null);
    }

    public final void C() {
        int selectionEnd;
        int w0;
        int w02;
        int i = this.U1;
        if (i >= 0 && (selectionEnd = this.V1) >= 0) {
            this.V1 = -1;
            this.U1 = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        bt3 bt3Var = new bt3(this, i, selectionEnd);
        jc jcVar = new jc((byte) 10);
        Pattern pattern = ij.a;
        if (context == null) {
            return;
        }
        wjb wjbVar = this.Z1;
        int i2 = bkb.i5;
        if (wjbVar != null) {
            w0 = wjbVar.f(i2);
            w02 = wjbVar.f(bkb.g5);
            wjbVar.f(bkb.zj);
            wjbVar.f(bkb.Dj);
            wjbVar.f(bkb.D8);
            wjbVar.f(bkb.F8);
            wjbVar.f(bkb.h6);
            wjbVar.f(bkb.Ii);
            wjbVar.f(bkb.Ei);
            wjbVar.f(bkb.Gi);
        } else {
            w0 = bkb.w0(null, i2, false);
            w02 = bkb.w0(null, bkb.g5, false);
            bkb.w0(null, bkb.zj, false);
            bkb.w0(null, bkb.Dj, false);
            bkb.w0(null, bkb.D8, false);
            bkb.w0(null, bkb.F8, false);
            bkb.w0(null, bkb.h6, false);
            bkb.w0(null, bkb.Ii, false);
            bkb.w0(null, bkb.Ei, false);
            bkb.w0(null, bkb.Gi, false);
        }
        int i3 = w0;
        int i4 = w02;
        i4d i4dVar = new i4d(context, wjbVar);
        Object obj = i4dVar.a;
        ((fx0) obj).w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i5 = calendar.get(1);
        hn7 hn7Var = new hn7(context, wjbVar);
        hn7Var.setTextColor(i3);
        hn7Var.setTextOffset(gl.L(10.0f));
        hn7Var.setItemCount(5);
        hn7Var.setMinValue(1);
        hn7Var.setMaxValue(31);
        hn7Var.setWrapSelectorWheel(false);
        hn7Var.setFormatter(new ag((byte) 16));
        hn7 hn7Var2 = new hn7(context, wjbVar);
        hn7Var2.setTextColor(i3);
        hn7Var2.setTextOffset(-gl.L(10.0f));
        hn7Var2.setItemCount(5);
        hn7Var2.setMinValue(0);
        hn7Var2.setMaxValue(239);
        hn7Var2.setValue(120);
        hn7Var2.setWrapSelectorWheel(false);
        hn7Var2.setFormatter(new jh(calendar, i5, (byte) 0));
        hn7 hn7Var3 = new hn7(context, wjbVar);
        hn7Var3.setContentDescriptionCallback(new pb((byte) 1));
        hn7Var3.setWrapSelectorWheel(true);
        hn7Var3.setAllItemsCount(24);
        hn7Var3.setItemCount(5);
        hn7Var3.setTextColor(i3);
        hn7Var3.setTextOffset(gl.L(10.0f));
        hn7Var3.setMinValue(0);
        hn7Var3.setMaxValue(23);
        hn7Var3.setFormatter(new ag((byte) 17));
        hn7 hn7Var4 = new hn7(context, wjbVar);
        hn7Var4.setContentDescriptionCallback(new pb((byte) 2));
        hn7Var4.setWrapSelectorWheel(true);
        hn7Var4.setAllItemsCount(60);
        hn7Var4.setItemCount(5);
        hn7Var4.setTextColor(i3);
        hn7Var4.setTextOffset(-gl.L(10.0f));
        hn7Var4.setMinValue(0);
        hn7Var4.setMaxValue(59);
        hn7Var4.setValue(0);
        hn7Var4.setFormatter(new ag((byte) 18));
        calendar.setTimeInMillis(currentTimeMillis);
        hn7Var4.setValue(calendar.get(12));
        hn7Var3.setValue(calendar.get(11));
        hn7Var.setValue(calendar.get(5));
        hn7Var2.setValue(calendar.get(2) + 120);
        tgb tgbVar = new tgb(k96.a0(null, null, 2131742520, "", "").trim(), 16.0f, null);
        tgbVar.o(gl.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        tgbVar.a();
        tgbVar.l(1);
        tgbVar.m(i3);
        tgb tgbVar2 = new tgb(":", 18.0f, null);
        tgbVar2.o(gl.L(100.0f));
        tgbVar2.a();
        tgbVar2.l(1);
        tgbVar2.a.setColor(i3);
        FrameLayout frameLayout = new FrameLayout(context);
        ji jiVar = new ji(context, hn7Var2, hn7Var, hn7Var3, hn7Var4);
        jiVar.setOrientation(1);
        frameLayout.addView(jiVar, nme.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        jiVar.addView(frameLayout2, nme.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131746143, null));
        textView.setTextColor(i3);
        ir2.t(textView, 1, 20.0f);
        frameLayout2.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 12));
        f7 f7Var = new f7(context, tgbVar2, hn7Var4);
        f7Var.setOrientation(0);
        f7Var.setWeightSum(1.0f);
        jiVar.addView(f7Var, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        u41 u41Var = new u41(wjbVar, context, true);
        kh khVar = new kh(u41Var, hn7Var, hn7Var2, hn7Var3, hn7Var4);
        f7Var.addView(hn7Var, nme.l(0.2f, 0, 270));
        f7Var.addView(hn7Var2, nme.l(0.4f, 0, 270));
        f7Var.addView(hn7Var3, nme.l(0.2f, 0, 270));
        f7Var.addView(hn7Var4, nme.l(0.2f, 0, 270));
        hn7Var.setOnValueChangedListener(khVar);
        hn7Var2.setOnValueChangedListener(khVar);
        hn7Var3.setOnValueChangedListener(khVar);
        hn7Var4.setOnValueChangedListener(khVar);
        boolean[] zArr = {true};
        u41Var.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        u41Var.f();
        jiVar.addView(u41Var, nme.t(-1, 48, 83, 16, 15, 16, 16));
        u41Var.setOnClickListener(new lh(zArr, hn7Var, hn7Var2, hn7Var3, hn7Var4, bt3Var, new int[1], i4dVar));
        fx0 fx0Var = (fx0) obj;
        fx0Var.O = frameLayout;
        fx0Var.show();
        fx0Var.setOnDismissListener(new g5(jcVar, zArr, (byte) 4));
        fx0Var.s0(i4);
        fx0Var.L(i4);
        ij.c(u41Var, hn7Var, hn7Var2, hn7Var3, hn7Var4);
    }

    public final void D(q62 q62Var) {
        int selectionEnd;
        int i = this.U1;
        if (i >= 0 && (selectionEnd = this.V1) >= 0) {
            this.V1 = -1;
            this.U1 = -1;
        } else {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        I(k96.M0(2131751732, null), k96.M0(2131743678, null), "http://", true, this.c2, new wy0(this, i, selectionEnd, q62Var));
    }

    public final boolean H(int i) {
        int selectionEnd;
        wjb wjbVar;
        int selectionEnd2;
        if (i == 2131296505) {
            A(null);
            return true;
        } else if (i == 2131296493) {
            ?? obj = new Object();
            obj.a |= 1;
            A(new wib(obj, 0));
            return true;
        } else if (i == 2131296499) {
            ?? obj2 = new Object();
            obj2.a |= 2;
            A(new wib(obj2, 0));
            return true;
        } else if (i == 2131296501) {
            ?? obj3 = new Object();
            obj3.a |= 4;
            A(new wib(obj3, 0));
            return true;
        } else if (i == 2131296500) {
            D(null);
            return true;
        } else if (i == 2131296511) {
            ?? obj4 = new Object();
            obj4.a |= 8;
            A(new wib(obj4, 0));
            return true;
        } else if (i == 2131296514) {
            ?? obj5 = new Object();
            obj5.a |= 16;
            A(new wib(obj5, 0));
            return true;
        } else if (i == 2131296510) {
            ?? obj6 = new Object();
            obj6.a |= 256;
            A(new wib(obj6, 0));
            h();
            return true;
        } else if (i == 2131296504) {
            int i2 = this.U1;
            if (i2 >= 0 && (selectionEnd2 = this.V1) >= 0) {
                this.V1 = -1;
                this.U1 = -1;
            } else {
                i2 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            }
            int c = ey8.c(getText(), i2, selectionEnd2, false);
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
            int i3 = this.U1;
            if (i3 >= 0 && (selectionEnd = this.V1) >= 0) {
                this.V1 = -1;
                this.U1 = -1;
            } else {
                i3 = getSelectionStart();
                selectionEnd = getSelectionEnd();
            }
            CharSequence subSequence = getText().subSequence(i3, selectionEnd);
            d S = LaunchActivity.S();
            Context context = getContext();
            if (S != null) {
                wjbVar = S.getResourceProvider();
            } else {
                wjbVar = null;
            }
            ?? fy0Var = new fy0(context, null, false, false, 2, wjbVar);
            wjb wjbVar2 = wjbVar;
            fy0Var.b2 = 1;
            fy0Var.c2 = new String[]{"formal", "neutral", "casual"};
            fy0Var.d2 = new String[]{"Formal", "Neutral", "Casual"};
            fy0Var.f2 = true;
            fy0Var.g2 = -1;
            ImageView imageView = new ImageView(context);
            fy0Var.S1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231272);
            int i4 = bkb.F6;
            zkb.s(imageView, i4, wjbVar2, PorterDuff.Mode.SRC_ATOP);
            ff0 f0 = bkb.f0(bkb.p1(0.1f, bkb.v0(i4, fy0Var.J0)), 1, -1);
            vkb K = zkb.K(0.1f, i4);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, K, wjbVar2);
            fy0Var.o1.addView(imageView, nme.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            ote.b(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new tzb(fy0Var, (byte) 2));
            String G0 = rzb.G0();
            fy0Var.a2 = G0;
            if (G0 == null) {
                fy0Var.a2 = b1c.i();
            }
            fy0Var.F1 = false;
            fy0Var.E1 = gl.L(12.0f);
            int i5 = bkb.Z6;
            fy0Var.s0(bkb.v0(i5, fy0Var.J0));
            FrameLayout frameLayout = new FrameLayout(context);
            fy0Var.T1 = frameLayout;
            frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, bkb.v0(i5, fy0Var.J0)), bkb.v0(i5, fy0Var.J0), bkb.v0(i5, fy0Var.J0)}));
            u41 u41Var = new u41(wjbVar2, context, true);
            u41Var.setRoundRadius(24);
            fy0Var.U1 = u41Var;
            u41Var.setText(k96.M0(2131747638, null));
            FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
            int i6 = d.leftMargin;
            int i7 = fy0Var.u0;
            d.leftMargin = i6 + i7;
            d.rightMargin += i7;
            frameLayout.addView(u41Var, d);
            fy0Var.b.addView(frameLayout, nme.e(-1, -2, 80));
            int i8 = fy0Var.u0;
            int L = gl.L(66.0f);
            o39 o39Var = fy0Var.n1;
            o39Var.setPadding(i8, 0, i8, L);
            o39Var.setClipToPadding(false);
            o39Var.r1();
            o39Var.setOnItemClickListener(new k0(fy0Var, wjbVar2, (byte) 23));
            gb3 gb3Var = new gb3();
            gb3Var.m = false;
            gb3Var.C = false;
            gb3Var.o(s33.h);
            gb3Var.n(350L);
            o39Var.setItemAnimator(gb3Var);
            fy0Var.e2.O(false);
            fy0Var.V1 = subSequence;
            cme.b(subSequence.toString(), new hza(fy0Var, (byte) 19), new fyb((byte) 1), false);
            fy0Var.Y1 = new at3(this, i3, selectionEnd);
            fy0Var.show();
            setSelection(i3, selectionEnd);
            return true;
        }
    }

    public final void I(String str, String str2, String str3, boolean z, boolean z2, ft3 ft3Var) {
        AlertDialog$Builder alertDialog$Builder;
        String str4;
        int i;
        CharSequence charSequence;
        wjb wjbVar = this.Z1;
        if (z2) {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, getContext());
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, getContext());
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        hd hdVar = alertDialog$Builder2.a;
        hdVar.S = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final ps0 ps0Var = new ps0(getContext(), (byte) 3);
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        ps0Var.setTextSize(1, 18.0f);
        ps0Var.setText(str4);
        zkb.X(ps0Var, bkb.i5, wjbVar);
        ps0Var.setHintText(str2);
        zkb.l(ps0Var, 35, bkb.K6, wjbVar);
        ps0Var.setSingleLine(true);
        ps0Var.setFocusable(true);
        ps0Var.setTransformHintToHeader(true);
        zkb.F(ps0Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        ps0Var.setImeOptions(6);
        ps0Var.setBackgroundDrawable(null);
        ps0Var.requestFocus();
        ps0Var.setPadding(0, 0, 0, 0);
        zkb.C(ps0Var, bkb.kg, wjbVar);
        zkb.l(ps0Var, 36, bkb.lg, wjbVar);
        frameLayout.addView(ps0Var, nme.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131747242, null));
        textView.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        textView.setGravity(17);
        int i2 = bkb.n6;
        int v0 = bkb.v0(i2, wjbVar);
        zkb.X(textView, i2, wjbVar);
        int L = gl.L(6.0f);
        int p1 = bkb.p1(0.12f, v0);
        int p12 = bkb.p1(0.15f, v0);
        ff0 i0 = bkb.i0(L, L, L, L, p1, p12, p12);
        vkb K = zkb.K(0.12f, i2);
        vkb K2 = zkb.K(0.15f, i2);
        textView.setBackground(i0);
        zkb.j(textView, i0, K, K2, wjbVar);
        ote.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, nme.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        z77 z77Var = new z77(this, z, ps0Var, str4, textView, (byte) 10);
        textView.setOnClickListener(new b0(this, ps0Var, z77Var, (byte) 27));
        ps0Var.addTextChangedListener(new b7(z77Var, (byte) 19));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                fa4.g(e, true);
                charSequence = null;
            }
            if (charSequence != null) {
                ps0Var.setText(charSequence);
                ps0Var.setSelection(0, ps0Var.getText().length());
            }
        }
        z77Var.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.j(k96.M0(2131747638, null), new v82(ft3Var, ps0Var, (byte) 24));
        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
        if (z2) {
            this.b2 = hdVar;
            hdVar.setOnDismissListener(new n1(this, (byte) 18));
            this.b2.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    ps0 ps0Var2 = ps0Var;
                    switch (b) {
                        case 0:
                            ps0Var2.requestFocus();
                            gl.F3(ps0Var2);
                            return;
                        default:
                            ps0Var2.requestFocus();
                            gl.F3(ps0Var2);
                            return;
                    }
                }
            });
            this.b2.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    ps0 ps0Var2 = ps0Var;
                    switch (b) {
                        case 0:
                            ps0Var2.requestFocus();
                            gl.F3(ps0Var2);
                            return;
                        default:
                            ps0Var2.requestFocus();
                            gl.F3(ps0Var2);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ps0Var.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L2 = gl.L(24.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.height = gl.L(36.0f);
            ps0Var.setLayoutParams(marginLayoutParams);
        }
        ps0Var.setSelection(0, ps0Var.getText().length());
    }

    @Override
    public void a(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text != null && i2 >= 0 && i3 >= 0 && i2 < i3 && i2 < (min = Math.min(i3, text.length()))) {
            ?? obj = new Object();
            obj.a = i;
            hq6.f(new wib(obj, 0), i2, min, text, true);
            if ((i & 256) != 0) {
                h();
            }
            et3 et3Var = this.T1;
            if (et3Var != null) {
                et3Var.m();
            }
        }
    }

    @Override
    public void b(int i, int i2, int i3) {
        wib[] wibVarArr;
        Editable text = getText();
        if (text != null && i2 >= 0 && i3 >= 0 && i2 < i3) {
            int min = Math.min(i3, text.length());
            int i4 = i & 256;
            if (i4 != 0) {
                i |= 512;
            }
            for (wib wibVar : (wib[]) text.getSpans(i2, min, wib.class)) {
                vib vibVar = wibVar.b;
                int i5 = vibVar.a;
                if ((i5 & i) != 0) {
                    int spanStart = text.getSpanStart(wibVar);
                    int spanEnd = text.getSpanEnd(wibVar);
                    text.removeSpan(wibVar);
                    if (spanStart < i2) {
                        text.setSpan(new wib(new vib(vibVar), 0), spanStart, i2, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new wib(new vib(vibVar), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i2);
                    int min2 = Math.min(spanEnd, min);
                    int i6 = i5 & (~i);
                    if (i6 != 0 && max < min2) {
                        vib vibVar2 = new vib(vibVar);
                        vibVar2.a = i6;
                        text.setSpan(new wib(vibVar2, 0), max, min2, 33);
                    }
                }
            }
            if (i4 != 0) {
                h();
            }
            et3 et3Var = this.T1;
            if (et3Var != null) {
                et3Var.m();
            }
        }
    }

    @Override
    public int c(int i, int i2) {
        Editable text = getText();
        if (text != null) {
            int max = Math.max(0, i);
            int min = Math.min(i2, text.length());
            if (max >= 0 && min >= 0 && max < min) {
                wib[] wibVarArr = (wib[]) text.getSpans(max, min, wib.class);
                int i3 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    int i5 = d2[i4];
                    int i6 = max;
                    boolean z = true;
                    while (z && i6 < min) {
                        z = false;
                        for (int i7 = 0; i7 < wibVarArr.length; i7++) {
                            wib wibVar = wibVarArr[i7];
                            int i8 = wibVar.b.a;
                            if ((i8 & 512) != 0) {
                                i8 |= 256;
                            }
                            if ((i8 & i5) != 0) {
                                int spanStart = text.getSpanStart(wibVar);
                                int spanEnd = text.getSpanEnd(wibVarArr[i7]);
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
        return this.W1;
    }

    public String getCaption() {
        return this.M1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.E == this.a2) {
            int v0 = bkb.v0(bkb.Id, this.Z1);
            this.a2 = v0;
            this.E = v0;
        }
        canvas.save();
        canvas.translate(0.0f, this.P);
        super.onDraw(canvas);
        try {
            if (this.N1 != null && this.P1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.S1);
                canvas.save();
                canvas.translate(this.Q1, this.R1);
                this.N1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (this.O1 != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            canvas2 = canvas;
            this.O1.c(layout.getLineRight(0), (getHeight() / 2.0f) + gl.L(1.0f), 1.0f, this.S1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        u4 u4Var = new u4(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.M1)) {
            u4Var.l(this.M1);
        }
        ArrayList d = u4Var.d();
        int size = d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            r4 r4Var = (r4) d.get(i);
            if (((AccessibilityNodeInfo.AccessibilityAction) r4Var.a).getId() == 268435456) {
                u4Var.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) r4Var.a);
                break;
            }
            i++;
        }
        if (hasSelection()) {
            u4Var.b(new r4(null, 2131296510, k96.M0(2131745025, null), null));
            u4Var.b(new r4(null, 2131296493, k96.M0(2131753668, null), null));
            u4Var.b(new r4(null, 2131296499, k96.M0(2131748895, null), null));
            u4Var.b(new r4(null, 2131296501, k96.M0(2131748158, null), null));
            u4Var.b(new r4(null, 2131296511, k96.M0(2131744196, null), null));
            u4Var.b(new r4(null, 2131296514, k96.M0(2131743650, null), null));
            u4Var.b(new r4(null, 2131296500, k96.M0(2131751732, null), null));
            u4Var.b(new r4(null, 2131296505, k96.M0(2131746144, null), null));
            u4Var.b(new r4(null, 2131296495, k96.M0(2131750573, null), null));
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
            this.Y1 = z;
            super.onMeasure(i, i2);
            if (this.Y1) {
                this.X1 = getLineCount();
            }
            this.Y1 = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(51.0f));
            fa4.g(e, true);
        }
        this.N1 = null;
        String str = this.M1;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                CharSequence subSequence = text.subSequence(0, indexOf + 1);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i3));
                this.P1 = subSequence.length();
                int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
                CharSequence ellipsize = TextUtils.ellipsize(this.M1, paint, measuredWidth, TextUtils.TruncateAt.END);
                this.Q1 = ceil;
                try {
                    StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.N1 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        this.Q1 = (int) (this.Q1 + (-this.N1.getLineLeft(0)));
                    }
                    this.R1 = ((getMeasuredHeight() - this.N1.getLineBottom(0)) / 2) + gl.L(0.5f);
                } catch (Exception e2) {
                    fa4.g(e2, true);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nw2.a(primaryClip.getItemAt(0).getHtmlText()));
                    vu3.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    gm[] gmVarArr = (gm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gm.class);
                    if (gmVarArr != null) {
                        for (gm gmVar : gmVarArr) {
                            gmVar.applyFontMetrics(getPaint().getFontMetricsInt(), vl.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    dy8[] dy8VarArr = (dy8[]) getText().getSpans(max, min, dy8.class);
                    if (dy8VarArr != null && dy8VarArr.length > 0) {
                        dy8[] dy8VarArr2 = (dy8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dy8.class);
                        for (int i2 = 0; i2 < dy8VarArr2.length; i2++) {
                            spannableStringBuilder.removeSpan(dy8VarArr2[i2]);
                            spannableStringBuilder.removeSpan(dy8VarArr2[i2].a);
                        }
                    } else {
                        ey8.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        } else {
            try {
                if (i == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    gl.g(getText().subSequence(max2, min2));
                    gl.W(getContext()).closeContextMenu();
                    yi4 yi4Var = this.Z0;
                    if (yi4Var != null) {
                        yi4Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                } else if (i == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    gl.g(getText().subSequence(max3, min3));
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
            fa4.g(th, true);
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
        this.W1 = z;
    }

    public void setCaption(String str) {
        String str2 = this.M1;
        if ((str2 != null && str2.length() != 0) || (str != null && str.length() != 0)) {
            String str3 = this.M1;
            if (str3 == null || !str3.equals(str)) {
                this.M1 = str;
                if (str != null) {
                    this.M1 = str.replace('\n', ' ');
                }
                requestLayout();
            }
        }
    }

    public void setDelegate(et3 et3Var) {
        this.T1 = et3Var;
    }

    @Override
    public void setHintColor(int i) {
        super.setHintColor(i);
        this.S1 = i;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.O1 = new tgb(charSequence, 16.0f, getTypeface());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new zs3(new dt3(this, callback), callback, (byte) 1));
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return super.startActionMode(new zs3(new dt3(this, callback), callback, (byte) 1), i);
    }

    public void E() {
    }

    public void F() {
    }

    public void G(int i, int i2) {
    }
}
