package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vma extends fy0 {
    public static final int Y1 = 0;
    public final ge0 S1;
    public final LinearLayout T1;
    public final LinearLayout U1;
    public boolean V1;
    public boolean W1;
    public l5c X1;

    public vma(final Context context, final int i, final wjb wjbVar, final x0 x0Var) {
        super(1, wjbVar, context, true);
        int i2;
        int i3;
        this.a = i;
        this.u1 = 0.2f;
        this.Q0 = true;
        this.R0 = true;
        ge0 ge0Var = new ge0(context, i, oj.b, wjbVar);
        this.S1 = ge0Var;
        ge0Var.setScaleX(0.6f);
        ge0Var.setScaleY(0.6f);
        ge0Var.setAlpha(0.0f);
        this.c.addView(ge0Var, 0, nme.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ote.a(ge0Var);
        ge0Var.setOnClickListener(new ky(context, wjbVar, (byte) 2));
        TLRPC.EmojiGameInfo emojiGameInfo = na7.q1(i).k5;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231063);
        linearLayout.addView(imageView, nme.t(80, 80, 1, 0, 0, 0, 8));
        int i4 = bkb.i5;
        TextView b = hve.b(context, 20.0f, i4, true, null);
        b.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131745001, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k96.M0(2131745000, null));
        spannableStringBuilder.setSpan(new a76(wjbVar), length, spannableStringBuilder.length(), 33);
        b.setText(spannableStringBuilder);
        linearLayout.addView(b, nme.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b2 = hve.b(context, 14.0f, i4, false, null);
        de9.q(b2, 17, null, 2131745002);
        linearLayout.addView(b2, nme.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b3 = hve.b(context, 14.0f, bkb.K6, true, null);
        b3.setText(k96.M0(2131745004, null));
        linearLayout2.addView(b3, nme.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        mfb mfbVar = new mfb(context, wjbVar);
        linearLayout2.addView(mfbVar, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        mfbVar.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        mfbVar.addView(tableRow2);
        lt ltVar = new lt(context, new int[]{2131231058, 2131231059, 2131231060, 2131231061, 2131231062, 2131231063, 2131231063}, wjbVar, mfbVar, (byte) 21);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) ltVar.g(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) ltVar.g(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) ltVar.g(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) ltVar.g(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) ltVar.g(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) ltVar.g(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) ltVar.g(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b4 = hve.b(context, 14.0f, bkb.x6, false, null);
        b4.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        cm2 cm2Var = new cm2(2131231063, 0);
        cm2Var.d = false;
        cm2Var.I = 0.8f;
        cm2Var.J = 0.8f;
        spannableStringBuilder2.setSpan(cm2Var, 0, spannableStringBuilder2.length(), 33);
        b4.setText(gl.J2(k96.M0(2131745003, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b4, nme.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, nme.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.U1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(gl.L(42.0f), gl.L(0.0f), gl.L(42.0f), gl.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final er7 er7Var = new er7(context, wjbVar);
        er7Var.setForceForceUseCenter(true);
        er7Var.setText(k96.M0(2131745005, null));
        er7Var.setLeftPadding(gl.L(36.0f));
        zkb.X(editTextBoldCursor, bkb.F6, wjbVar);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = gl.L(16.0f);
        editTextBoldCursor.setPadding(gl.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        zkb.C(editTextBoldCursor, bkb.kg, wjbVar);
        zkb.l(editTextBoldCursor, 36, bkb.lg, wjbVar);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        editTextBoldCursor.setGravity(i2);
        editTextBoldCursor.setOnFocusChangeListener(new jt0(er7Var, editTextBoldCursor, (byte) 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131231056);
        linearLayout4.addView(imageView2, nme.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, nme.p(-1, -2, 1.0f, 119));
        er7Var.e(editTextBoldCursor);
        er7Var.addView(linearLayout4, nme.e(-1, -2, 48));
        linearLayout3.addView(er7Var, nme.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.z6, null);
        er7Var.addView(textView, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j = tL_emojiGameDiceInfo.prev_stake;
        j = j <= 0 ? 1000000000L : j;
        editTextBoldCursor.setText(jva.J0(j));
        float f = 1.0f;
        textView.setAlpha(1.0f);
        StringBuilder sb = new StringBuilder("≈");
        ci0.h();
        sb.append(ci0.f("USD", 2, (long) ((j / 1.0E9d) * na7.q1(i).k4.k.i * 100.0d), false));
        textView.setText(sb.toString());
        final int[] iArr = {2};
        er7Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        editTextBoldCursor.addTextChangedListener(new uma(i, editTextBoldCursor, er7Var, iArr, textView));
        r rVar = new r(context, wjbVar, editTextBoldCursor);
        long[] jArr = na7.q1(i).U3;
        int i5 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.a;
            int i6 = 3;
            if (i5 < (length2 + 2) / 3) {
                LinearLayout j2 = de9.j(context, 0);
                int i7 = 0;
                float f2 = f;
                while (true) {
                    int i8 = i5 * 3;
                    if (i7 < Math.min(i6, jArr.length - i8)) {
                        View view = (View) rVar.a(Long.valueOf(jArr[i8 + i7]));
                        if (i7 == 2) {
                            i3 = 0;
                        } else {
                            i3 = 6;
                        }
                        j2.addView(view, nme.q(0, 26, 1.0f, 112, 0, 0, i3, 0));
                        i7++;
                        i6 = 3;
                    }
                }
                this.U1.addView(j2, nme.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i5++;
                f = f2;
            } else {
                u41 u41Var = new u41(wjbVar, context, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                cm2 cm2Var2 = new cm2(2131231976, 0);
                cm2Var2.s = gl.L(f);
                spannableStringBuilder3.setSpan(cm2Var2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) k96.M0(2131745006, null));
                u41Var.i(spannableStringBuilder3, false, true);
                u41Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        double parseDouble;
                        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                        Editable text = editTextBoldCursor2.getText();
                        try {
                            if (TextUtils.isEmpty(text)) {
                                parseDouble = 0.0d;
                            } else {
                                parseDouble = Double.parseDouble(text.toString());
                            }
                            int i9 = i;
                            int i10 = (parseDouble > (na7.q1(i9).k4.N2.f() / 1.0E9d) ? 1 : (parseDouble == (na7.q1(i9).k4.N2.f() / 1.0E9d) ? 0 : -1));
                            er7 er7Var2 = er7Var;
                            int[] iArr2 = iArr;
                            if (i10 > 0) {
                                editTextBoldCursor2.setText(Double.toString(na7.q1(i9).k4.N2.f() / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i11 = -iArr2[0];
                                iArr2[0] = i11;
                                gl.B3(i11, er7Var2, null);
                            } else if (!TextUtils.isEmpty(text) && parseDouble < na7.q1(i9).k4.M2.f() / 1.0E9d) {
                                editTextBoldCursor2.setText(Double.toString(na7.q1(i9).k4.M2.f() / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i12 = -iArr2[0];
                                iArr2[0] = i12;
                                gl.B3(i12, er7Var2, null);
                            } else if (gta.v(i9, true).f.toDouble() < parseDouble) {
                                new xdb(context, wjbVar, nj.j((long) (parseDouble * 1.0E9d), oj.b), new jc((byte) 10));
                            } else {
                                x0Var.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                vma.this.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(u41Var, nme.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.b;
                int i9 = this.u0;
                viewGroup.addView(frameLayout, nme.f(-2.0f, -1, 87, i9, 0, i9, 0));
                o39 o39Var = this.n1;
                int i10 = this.u0;
                o39Var.setPadding(i10, 0, i10, gl.L(68.0f));
                this.X1.O(false);
                return;
            }
        }
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new tf8(this, (byte) 22), this.J0);
        this.X1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131745001, null);
    }

    @Override
    public final boolean U(float f, float f2) {
        ge0 ge0Var = this.S1;
        if (f >= ge0Var.getX() && f <= ge0Var.getX() + ge0Var.getWidth() && f2 >= ge0Var.getY() && f2 <= ge0Var.getY() + ge0Var.getHeight()) {
            return false;
        }
        return super.U(f, f2);
    }

    public final void Y0() {
        boolean z;
        float f;
        if (this.V1 && !this.J && !this.d) {
            z = true;
        } else {
            z = false;
        }
        if (this.W1 != z) {
            this.W1 = z;
            ge0 ge0Var = this.S1;
            if (ge0Var != null) {
                ge0Var.setEnabled(z);
                ge0Var.setClickable(z);
                ViewPropertyAnimator animate = ge0Var.animate();
                float f2 = 0.6f;
                float f3 = 1.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f);
                if (z) {
                    f2 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f2);
                if (!z) {
                    f3 = 0.0f;
                }
                ug8.s(scaleY, f3, 180L);
            }
        }
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        Y0();
    }

    @Override
    public final void k0() {
        this.V1 = false;
        Y0();
    }

    @Override
    public final void x() {
        this.V1 = true;
        Y0();
    }
}
