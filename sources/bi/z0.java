package bi;

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
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
public final class z0 extends FrameLayout implements m70 {
    public final TextView E;
    public final TextView F;
    public final nq[] G;
    public final nq[] H;
    public int I;
    public ValueAnimator J;
    public e1 K;
    public final Paint L;
    public boolean f4059a;
    public boolean f4060b;
    public final int f4061c;
    public final boolean d;
    public Drawable f4062e;
    public float f4063f;
    public final v0 h;
    public final LinearLayout f4064n;
    public final wh.p f4065r;
    public final wh.p f4066s;
    public CharSequence v;
    public final org.telegram.ui.Components.x9 f4067w;
    public final org.telegram.ui.Components.i9 f4068x;
    public final wh.p f4069y;

    public z0(int i10, Context context, boolean z10) {
        super(context);
        this.f4059a = false;
        this.f4060b = true;
        this.f4063f = 0.5f;
        this.G = new nq[1];
        this.H = new nq[1];
        this.L = new Paint(1);
        this.f4061c = i10;
        this.d = z10;
        v0 v0Var = new v0(this, context);
        this.h = v0Var;
        v0Var.setOrientation(0);
        addView(v0Var, w7.x5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f4068x = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f4067w = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        v0Var.addView(x9Var, w7.x5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        v0Var.addView(linearLayout, w7.x5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f4064n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.x5.n(-2, -2));
        wh.p pVar = new wh.p(context);
        this.f4065r = pVar;
        pVar.setTextColor(-1);
        pVar.setTextSize(1, 14.0f);
        pVar.setGravity(3);
        pVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(pVar, w7.x5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        wh.p pVar2 = new wh.p(context);
        this.f4066s = pVar2;
        pVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.55f, -1));
        pVar2.setTextSize(1, 12.0f);
        pVar2.setGravity(5);
        linearLayout2.addView(pVar2, w7.x5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        wh.p pVar3 = new wh.p(context);
        this.f4069y = pVar3;
        pVar3.setTextColor(-1);
        pVar3.setTextSize(1, 14.0f);
        pVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(pVar3);
        linearLayout.addView(pVar3, w7.x5.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        v0Var.addView(textView, w7.x5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        v0Var.addView(textView2, w7.x5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void b() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.f4062e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f4063f * 255.0f));
                this.h.invalidate();
            }
        }
        e1 e1Var = this.K;
        if (e1Var != null && this.f4062e != null) {
            this.I = e1Var.f2925a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ah.d0(this, 5));
            this.J.addListener(new ah.b(this, 5));
            this.J.setDuration(350L);
            this.J.setInterpolator(pr.h);
            this.J.start();
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        v0 v0Var = this.h;
        if (v0Var.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(v0Var.getX(), v0Var.getY(), v0Var.getX() + v0Var.getWidth(), v0Var.getY() + v0Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(e1 e1Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i10;
        CharSequence charSequence;
        int i11;
        boolean z11;
        float f7;
        this.K = e1Var;
        v0 v0Var = this.h;
        if ((e1Var == null || this.I != e1Var.f2925a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.f4062e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f4063f * 255.0f));
                v0Var.invalidate();
            }
        }
        long j3 = e1Var.f2927c;
        org.telegram.ui.Components.x9 x9Var = this.f4067w;
        org.telegram.ui.Components.i9 i9Var = this.f4068x;
        int i12 = this.f4061c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(e1Var.f2927c));
            i9Var.r(user);
            x9Var.e(user, i9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-e1Var.f2927c));
            i9Var.q(chat);
            x9Var.e(chat, i9Var);
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
        }
        int b10 = z.b(i12, (int) e1Var.f2930g, 3);
        int b11 = z.b(i12, (int) e1Var.f2930g, 4);
        int b12 = z.b(i12, (int) e1Var.f2930g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = e1Var.f2926b;
        boolean z13 = this.d;
        wh.p pVar = this.f4069y;
        if (z12 && e1Var.f2930g <= 0) {
            z10 = z13;
        } else {
            if (e1Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + e1Var.h));
                z10 = z13;
                nq nqVar = new nq(0, new u0(getContext(), e1Var.h));
                nqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, pVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i10 = 33;
                spannableStringBuilder.setSpan(new x0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = z.b(i12, (int) e1Var.f2930g, 1);
        int b14 = z.b(i12, (int) e1Var.f2930g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = e1Var.f2929f;
        if (tL_textWithEntities == null) {
            charSequence = " ";
            this.v = "";
        } else {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, pVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !e1Var.f2926b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (!(charSequence2 instanceof Spannable)) {
                charSequence = " ";
            } else {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.z5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (z5VarArr.length + emojiSpanArr.length <= b14 || e1Var.f2926b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i13 = 0;
                    while (i13 < z5VarArr.length) {
                        org.telegram.ui.Components.z5[] z5VarArr2 = z5VarArr;
                        int i14 = i13;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(z5VarArr2[i13])), Integer.valueOf(spannable.getSpanEnd(z5VarArr2[i14]))));
                        i13 = i14 + 1;
                        z5VarArr = z5VarArr2;
                    }
                    int i15 = 0;
                    while (i15 < emojiSpanArr.length) {
                        int i16 = i15;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i15])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i16]))));
                        i15 = i16 + 1;
                    }
                    Collections.sort(arrayList, new a4.e(9));
                    if (!(this.v instanceof SpannableStringBuilder)) {
                        this.v = new SpannableStringBuilder(this.v);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!e1Var.f2926b) {
                this.v = AndroidUtilities.replaceNewLines(this.v);
            }
            spannableStringBuilder.append(this.v);
        }
        pVar.setText(Emoji.replaceEmoji(spannableStringBuilder, pVar.getPaint().getFontMetricsInt(), false));
        this.f4062e = null;
        if (e1Var.f2926b && e1Var.f2930g <= 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f4064n.setVisibility(i11);
        long j10 = e1Var.f2930g;
        TextView textView = this.F;
        TextView textView2 = this.E;
        if (j10 > 0) {
            if (j10 >= 250) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f4059a = z11;
            v0Var.setWillNotDraw(!z11);
            v0Var.invalidate();
            pVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i17 = org.telegram.ui.ActionBar.j6.f20627a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.f4062e = gradientDrawable;
            v0Var.setBackground(gradientDrawable);
            Drawable drawable2 = this.f4062e;
            if (!z10) {
                f7 = 0.65f;
            } else {
                f7 = 1.0f;
            }
            this.f4063f = f7;
            drawable2.setAlpha((int) (f7 * 255.0f));
            if (!e1Var.f2928e) {
                textView.setVisibility(0);
                textView.setText(zh.v7.U0(false, i2.g.k(e1Var.f2930g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, b12)));
                textView2.setText(zh.v7.U0(false, i2.g.k(e1Var.f2930g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, AndroidUtilities.dp(0.66f), 1.0f));
                nq nqVar2 = this.G[0];
                if (nqVar2 != null) {
                    nqVar2.draw = this.f4060b;
                }
            }
        } else if (e1Var.f2926b) {
            this.f4059a = false;
            v0Var.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.f4062e = b02;
            v0Var.setBackground(b02);
            Drawable drawable3 = this.f4062e;
            this.f4063f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            pVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i12, e1Var.f2927c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new w0(), length, spannableStringBuilder2.length(), 33);
            this.f4065r.setText(spannableStringBuilder2);
            this.f4066s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f4059a = false;
            v0Var.setWillNotDraw(true);
            pVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
            this.f4062e = null;
            v0Var.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        v0Var.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.f4060b = z10;
        nq nqVar = this.G[0];
        if (nqVar != null && nqVar.draw != z10) {
            nqVar.draw = z10;
            this.E.invalidate();
        }
    }
}
