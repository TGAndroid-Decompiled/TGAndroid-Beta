package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class fu extends FrameLayout implements zlb, snb {
    public AnimatorSet E;
    public final boolean F;
    public TL_iv.pageBlockChannel G;
    public int a;
    public final xi5 b;
    public final ex c;
    public final ww2 d;
    public final TextView e;
    public final ImageView f;
    public byte h;
    public cw n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    public fu(Context context, xi5 xi5Var, ex exVar, int i) {
        super(context);
        this.s = hl.L(18.0f);
        this.w = hl.L(11.0f);
        this.b = xi5Var;
        this.c = exVar;
        setWillNotDraw(false);
        this.y = new Paint();
        this.F = i;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131752369, null));
        textView.setGravity(19);
        addView(textView, tre.e(-2, 39, 53));
        textView.setOnClickListener(new t(this, xi5Var, (byte) 18));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131231626);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.e(39, 39, 53));
        ww2 ww2Var = new ww2(context, 0);
        this.d = ww2Var;
        addView(ww2Var, tre.e(39, 39, 53));
    }

    public final void a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i;
        ImageView imageView = this.f;
        ww2 ww2Var = this.d;
        TextView textView = this.e;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.E = animatorSet2;
            if (i == 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, fArr);
            if (i == 0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            float[] fArr2 = {f11};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, fArr2);
            if (i == 0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property3, f12);
            if (i == 1) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ww2Var, property, f13);
            if (i == 1) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ww2Var, property2, f14);
            if (i == 1) {
                f15 = 1.0f;
            } else {
                f15 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(ww2Var, property3, f15);
            if (i == 2) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView, property, f16);
            if (i == 2) {
                f17 = 1.0f;
            } else {
                f17 = 0.1f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, property2, f17);
            if (i == 2) {
                f18 = 1.0f;
            } else {
                f18 = 0.1f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(imageView, property3, f18));
            this.E.setDuration(150L);
            this.E.start();
            return;
        }
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        textView.setAlpha(f);
        if (i == 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.1f;
        }
        textView.setScaleX(f2);
        if (i == 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.1f;
        }
        textView.setScaleY(f3);
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        ww2Var.setAlpha(f4);
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.1f;
        }
        ww2Var.setScaleX(f5);
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.1f;
        }
        ww2Var.setScaleY(f6);
        if (i == 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView.setAlpha(f7);
        if (i == 2) {
            f8 = 1.0f;
        } else {
            f8 = 0.1f;
        }
        imageView.setScaleX(f8);
        if (i == 2) {
            f9 = 1.0f;
        } else {
            f9 = 0.1f;
        }
        imageView.setScaleY(f9);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.M6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.y6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.n;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.n;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.n;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(39.0f), this.y);
            cw cwVar = this.n;
            if (cwVar != null && cwVar.d.getLineCount() > 0) {
                canvas.save();
                int i = this.w;
                int i2 = this.s;
                ex exVar = this.c;
                if (exVar != null && exVar.H) {
                    canvas.translate((getMeasuredWidth() - this.n.d.getLineWidth(0)) - i2, i);
                } else {
                    canvas.translate(i2, i);
                }
                if (!this.F) {
                    o.s(this.b, canvas, this, 0);
                }
                this.n.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        cw cwVar = this.n;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754900, o.g(this.b, this.c, cwVar)));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L = ((this.r / 2) + this.x) - hl.L(19.0f);
        int i5 = this.x;
        int L2 = hl.L(20.0f);
        int L3 = hl.L(39.0f);
        this.f.layout(L, 0, L2 + (this.r / 2) + i5, L3);
        this.d.layout(((this.r / 2) + this.x) - hl.L(19.0f), 0, hl.L(20.0f) + (this.r / 2) + this.x, hl.L(39.0f));
        int i6 = this.x;
        TextView textView = this.e;
        textView.layout(i6, 0, textView.getMeasuredWidth() + i6, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, hl.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), 1073741824);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), 1073741824));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - hl.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = o0b.a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.n = o.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignment2, 1, this.c);
            int i3 = this.s;
            ex exVar = this.c;
            if (exVar != null && exVar.H) {
                this.x = i3;
            } else {
                this.x = (getMeasuredWidth() - i3) - this.r;
            }
            cw cwVar = this.n;
            if (cwVar != null) {
                cwVar.s = i3;
                cwVar.w = this.w;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F) {
            return super.onTouchEvent(motionEvent);
        }
        if (!o.i(this.b, this.c, motionEvent, this, this.n, this.s, this.w) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        fu fuVar;
        this.G = pageblockchannel;
        boolean z = this.F;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        xi5 xi5Var = this.b;
        if (!z) {
            int i = aob.M6;
            o oVar = (o) xi5Var;
            oVar.getClass();
            int w0 = aob.w0(null, i, false);
            int red = Color.red(w0);
            int green = Color.green(w0);
            int blue = Color.blue(w0);
            oVar.getClass();
            textView.setTextColor(aob.w0(null, aob.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            oVar.getClass();
            this.a = aob.w0(null, aob.y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat M0 = uc7.s1(((o) xi5Var).Y).M0(Long.valueOf(pageblockchannel.channel.id));
        if (M0 != null && !M0.min) {
            xi5Var.n = M0;
            if (M0.left && !M0.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
            fuVar = this;
        } else {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!xi5Var.r && xc2.t0(chat)) {
                xi5Var.r = true;
                int i2 = ((o) xi5Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                fuVar = this;
                ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new lh(xi5Var, this.c, i2, fuVar, (byte) 1));
            } else {
                fuVar = this;
            }
            fuVar.a(1, false);
        }
        fuVar.requestLayout();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (!this.F && this.G != null && this.b != null && (textView = this.e) != null && (imageView = this.f) != null && (paint = this.y) != null) {
                int w0 = aob.w0(null, aob.M6, false);
                textView.setTextColor(aob.w0(null, aob.J6, false));
                paint.setColor(Color.argb(34, Color.red(w0), Color.green(w0), Color.blue(w0)));
                int w02 = aob.w0(null, aob.y6, false);
                if (w02 != this.a) {
                    this.a = w02;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
