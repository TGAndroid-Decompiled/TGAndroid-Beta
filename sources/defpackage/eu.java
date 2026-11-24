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
public final class eu extends FrameLayout implements eib, tjb {
    public AnimatorSet E;
    public final boolean F;
    public TL_iv.pageBlockChannel G;
    public int a;
    public final vg5 b;
    public final dx c;
    public final cw2 d;
    public final TextView e;
    public final ImageView f;
    public byte h;
    public bw n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    public eu(Context context, vg5 vg5Var, dx dxVar, int i) {
        super(context);
        this.s = gl.L(18.0f);
        this.w = gl.L(11.0f);
        this.b = vg5Var;
        this.c = dxVar;
        setWillNotDraw(false);
        this.y = new Paint();
        this.F = i;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131752385, null));
        textView.setGravity(19);
        addView(textView, nme.e(-2, 39, 53));
        textView.setOnClickListener(new t(this, vg5Var, (byte) 18));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131231626);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.e(39, 39, 53));
        cw2 cw2Var = new cw2(context, 0);
        this.d = cw2Var;
        addView(cw2Var, nme.e(39, 39, 53));
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
        cw2 cw2Var = this.d;
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
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cw2Var, property, f13);
            if (i == 1) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cw2Var, property2, f14);
            if (i == 1) {
                f15 = 1.0f;
            } else {
                f15 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(cw2Var, property3, f15);
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
        cw2Var.setAlpha(f4);
        if (i == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.1f;
        }
        cw2Var.setScaleX(f5);
        if (i == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.1f;
        }
        cw2Var.setScaleY(f6);
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
        hashSet.add(Integer.valueOf(bkb.L6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.x6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.n;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.n;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.n;
        if (bwVar != null) {
            bwVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gl.L(39.0f), this.y);
            bw bwVar = this.n;
            if (bwVar != null && bwVar.d.getLineCount() > 0) {
                canvas.save();
                int i = this.w;
                int i2 = this.s;
                dx dxVar = this.c;
                if (dxVar != null && dxVar.H) {
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
        bw bwVar = this.n;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754904, o.g(this.b, this.c, bwVar)));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L = ((this.r / 2) + this.x) - gl.L(19.0f);
        int i5 = this.x;
        int L2 = gl.L(20.0f);
        int L3 = gl.L(39.0f);
        this.f.layout(L, 0, L2 + (this.r / 2) + i5, L3);
        this.d.layout(((this.r / 2) + this.x) - gl.L(19.0f), 0, gl.L(20.0f) + (this.r / 2) + this.x, gl.L(39.0f));
        int i6 = this.x;
        TextView textView = this.e;
        textView.layout(i6, 0, textView.getMeasuredWidth() + i6, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, gl.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), 1073741824);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), 1073741824));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - gl.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = lwa.a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.n = o.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignment2, 1, this.c);
            int i3 = this.s;
            dx dxVar = this.c;
            if (dxVar != null && dxVar.H) {
                this.x = i3;
            } else {
                this.x = (getMeasuredWidth() - i3) - this.r;
            }
            bw bwVar = this.n;
            if (bwVar != null) {
                bwVar.s = i3;
                bwVar.w = this.w;
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
        eu euVar;
        this.G = pageblockchannel;
        boolean z = this.F;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        vg5 vg5Var = this.b;
        if (!z) {
            int i = bkb.L6;
            o oVar = (o) vg5Var;
            oVar.getClass();
            int w0 = bkb.w0(null, i, false);
            int red = Color.red(w0);
            int green = Color.green(w0);
            int blue = Color.blue(w0);
            oVar.getClass();
            textView.setTextColor(bkb.w0(null, bkb.I6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            oVar.getClass();
            this.a = bkb.w0(null, bkb.x6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat K0 = na7.q1(((o) vg5Var).Y).K0(Long.valueOf(pageblockchannel.channel.id));
        if (K0 != null && !K0.min) {
            vg5Var.n = K0;
            if (K0.left && !K0.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
            euVar = this;
        } else {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!vg5Var.r && hc2.t0(chat)) {
                vg5Var.r = true;
                int i2 = ((o) vg5Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                euVar = this;
                ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new ae(vg5Var, this.c, i2, euVar, (byte) 1));
            } else {
                euVar = this;
            }
            euVar.a(1, false);
        }
        euVar.requestLayout();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (!this.F && this.G != null && this.b != null && (textView = this.e) != null && (imageView = this.f) != null && (paint = this.y) != null) {
                int w0 = bkb.w0(null, bkb.L6, false);
                textView.setTextColor(bkb.w0(null, bkb.I6, false));
                paint.setColor(Color.argb(34, Color.red(w0), Color.green(w0), Color.blue(w0)));
                int w02 = bkb.w0(null, bkb.x6, false);
                if (w02 != this.a) {
                    this.a = w02;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
