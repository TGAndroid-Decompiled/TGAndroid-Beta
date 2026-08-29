package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import jh.ia;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;
public final class n0 extends FrameLayout implements i70 {
    public final TextView A;
    public final TextView B;
    public final iq[] C;
    public final iq[] D;
    public int E;
    public ValueAnimator F;
    public s0 G;
    public final Paint H;
    public boolean f15949a;
    public boolean f15950b;
    public final int f15951c;
    public final boolean d;
    public Drawable f15952e;
    public float f15953f;
    public final ag.v h;
    public final LinearLayout f15954n;
    public final gh.s f15955r;
    public final gh.s f15956s;
    public CharSequence v;
    public final t9 f15957w;
    public final org.telegram.ui.Components.e9 f15958x;
    public final gh.s f15959y;

    public n0(int i10, Context context, boolean z10) {
        super(context);
        this.f15949a = false;
        this.f15950b = true;
        this.f15953f = 0.5f;
        this.C = new iq[1];
        this.D = new iq[1];
        this.H = new Paint(1);
        this.f15951c = i10;
        this.d = z10;
        ag.v vVar = new ag.v(this, context);
        this.h = vVar;
        vVar.setOrientation(0);
        addView(vVar, i7.f6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f15958x = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var = new t9(context);
        this.f15957w = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        vVar.addView(t9Var, i7.f6.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        vVar.addView(linearLayout, i7.f6.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f15954n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, i7.f6.n(-2, -2));
        gh.s sVar = new gh.s(context);
        this.f15955r = sVar;
        sVar.setTextColor(-1);
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(3);
        sVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(sVar, i7.f6.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        gh.s sVar2 = new gh.s(context);
        this.f15956s = sVar2;
        sVar2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.55f, -1));
        sVar2.setTextSize(1, 12.0f);
        sVar2.setGravity(5);
        linearLayout2.addView(sVar2, i7.f6.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        gh.s sVar3 = new gh.s(context);
        this.f15959y = sVar3;
        sVar3.setTextColor(-1);
        sVar3.setTextSize(1, 14.0f);
        sVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.g6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(sVar3);
        linearLayout.addView(sVar3, i7.f6.n(-2, -2));
        TextView textView = new TextView(context);
        this.A = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        vVar.addView(textView, i7.f6.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.B = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        vVar.addView(textView2, i7.f6.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f9) {
        ag.v vVar = this.h;
        if (vVar.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(f9 * 0.5f, -16777216);
            Paint paint = this.H;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(vVar.getX(), vVar.getY(), vVar.getX() + vVar.getWidth(), vVar.getY() + vVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
            Drawable drawable = this.f15952e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f15953f * 255.0f));
                this.h.invalidate();
            }
        }
        s0 s0Var = this.G;
        if (s0Var != null && this.f15952e != null) {
            this.E = s0Var.f16194a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new bg.q1(this, 23));
            this.F.addListener(new ag.m0(this, 16));
            this.F.setDuration(350L);
            this.F.setInterpolator(jr.h);
            this.F.start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(s0 s0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i10;
        CharSequence charSequence;
        int i11;
        boolean z11;
        float f9;
        this.G = s0Var;
        ag.v vVar = this.h;
        if ((s0Var == null || this.E != s0Var.f16194a) && (valueAnimator = this.F) != null) {
            valueAnimator.cancel();
            this.F = null;
            Drawable drawable = this.f15952e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f15953f * 255.0f));
                vVar.invalidate();
            }
        }
        long j10 = s0Var.f16196c;
        t9 t9Var = this.f15957w;
        org.telegram.ui.Components.e9 e9Var = this.f15958x;
        int i12 = this.f15951c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(s0Var.f16196c));
            e9Var.r(user);
            t9Var.e(user, e9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-s0Var.f16196c));
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
        }
        int b10 = s.b(i12, (int) s0Var.f16199g, 3);
        int b11 = s.b(i12, (int) s0Var.f16199g, 4);
        int b12 = s.b(i12, (int) s0Var.f16199g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = s0Var.f16195b;
        boolean z13 = this.d;
        gh.s sVar = this.f15959y;
        if (z12 && s0Var.f16199g <= 0) {
            z10 = z13;
        } else {
            if (s0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + s0Var.h));
                z10 = z13;
                iq iqVar = new iq(0, new j0(getContext(), s0Var.h));
                iqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, sVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i10 = 33;
                spannableStringBuilder.setSpan(new l0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = s.b(i12, (int) s0Var.f16199g, 1);
        int b14 = s.b(i12, (int) s0Var.f16199g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = s0Var.f16198f;
        if (tL_textWithEntities == null) {
            charSequence = " ";
            this.v = "";
        } else {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, sVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !s0Var.f16195b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (!(charSequence2 instanceof Spannable)) {
                charSequence = " ";
            } else {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.y5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (y5VarArr.length + emojiSpanArr.length <= b14 || s0Var.f16195b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i13 = 0;
                    while (i13 < y5VarArr.length) {
                        org.telegram.ui.Components.y5[] y5VarArr2 = y5VarArr;
                        int i14 = i13;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(y5VarArr2[i13])), Integer.valueOf(spannable.getSpanEnd(y5VarArr2[i14]))));
                        i13 = i14 + 1;
                        y5VarArr = y5VarArr2;
                    }
                    int i15 = 0;
                    while (i15 < emojiSpanArr.length) {
                        int i16 = i15;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i15])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i16]))));
                        i15 = i16 + 1;
                    }
                    Collections.sort(arrayList, new c5.e(29));
                    if (!(this.v instanceof SpannableStringBuilder)) {
                        this.v = new SpannableStringBuilder(this.v);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!s0Var.f16195b) {
                this.v = AndroidUtilities.replaceNewLines(this.v);
            }
            spannableStringBuilder.append(this.v);
        }
        sVar.setText(Emoji.replaceEmoji(spannableStringBuilder, sVar.getPaint().getFontMetricsInt(), false));
        this.f15952e = null;
        if (s0Var.f16195b && s0Var.f16199g <= 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f15954n.setVisibility(i11);
        long j11 = s0Var.f16199g;
        TextView textView = this.B;
        TextView textView2 = this.A;
        if (j11 > 0) {
            if (j11 >= 250) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f15949a = z11;
            vVar.setWillNotDraw(!z11);
            vVar.invalidate();
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i17 = org.telegram.ui.ActionBar.g6.f23002a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.f15952e = gradientDrawable;
            vVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.f15952e;
            if (!z10) {
                f9 = 0.65f;
            } else {
                f9 = 1.0f;
            }
            this.f15953f = f9;
            drawable2.setAlpha((int) (f9 * 255.0f));
            if (!s0Var.f16197e) {
                textView.setVisibility(0);
                textView.setText(ia.U0(false, j7.l1.m(s0Var.f16199g, ',', new StringBuilder("⭐️ ")), 0.75f, this.D, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.l1(0.25f, b12)));
                textView2.setText(ia.U0(false, j7.l1.m(s0Var.f16199g, ',', new StringBuilder("⭐️ ")), 0.75f, this.C, AndroidUtilities.dp(0.66f), 1.0f));
                iq iqVar2 = this.C[0];
                if (iqVar2 != null) {
                    iqVar2.draw = this.f15950b;
                }
            }
        } else if (s0Var.f16195b) {
            this.f15949a = false;
            vVar.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.f15952e = b02;
            vVar.setBackground(b02);
            Drawable drawable3 = this.f15952e;
            this.f15953f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i12, s0Var.f16196c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new k0(), length, spannableStringBuilder2.length(), 33);
            this.f15955r.setText(spannableStringBuilder2);
            this.f15956s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f15949a = false;
            vVar.setWillNotDraw(true);
            sVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.g6.l1(0.6f, -16777216));
            this.f15952e = null;
            vVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        vVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.f15950b = z10;
        iq iqVar = this.C[0];
        if (iqVar != null && iqVar.draw != z10) {
            iqVar.draw = z10;
            this.A.invalidate();
        }
    }
}
