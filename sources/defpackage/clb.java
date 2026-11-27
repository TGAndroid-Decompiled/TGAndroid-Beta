package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public class clb extends FrameLayout implements snb {
    public final tpa a;
    public final blb b;
    public final blb c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final vnb n;

    public clb(int i, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        boolean z3;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.n = vnbVar;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.h = z3;
        tpa tpaVar = new tpa(vnbVar, context, true);
        this.a = tpaVar;
        tpaVar.setOnLinkLongPressListener(new o66(this) {
            public final clb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                clb clbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(clbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        tpaVar.setTextSize(1, 16.0f);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        tpaVar.setGravity(i2);
        if (z) {
            setMinimumHeight(hl.L(60.0f));
        } else {
            tpaVar.setLines(1);
            tpaVar.setMaxLines(1);
            tpaVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        tpaVar.setEllipsize(truncateAt);
        tpaVar.setImportantForAccessibility(2);
        tpaVar.setPadding(hl.L(6.0f), hl.L(2.0f), hl.L(6.0f), hl.L(5.0f));
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        float f2 = i - 6;
        if (z) {
            f = 27.0f;
        } else {
            f = 0.0f;
        }
        addView(tpaVar, tre.d(-2, -2.0f, i3, f2, 6.0f, f2, f));
        blb blbVar = new blb(this, context, vnbVar, (byte) 0);
        this.b = blbVar;
        blbVar.setOnLinkLongPressListener(new o66(this) {
            public final clb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                clb clbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(clbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z2) {
            setMinimumHeight(hl.L(60.0f));
        } else {
            blbVar.setLines(1);
            blbVar.setSingleLine(true);
        }
        blbVar.setTextSize(1, 13.0f);
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        blbVar.setGravity(i4);
        blbVar.setImportantForAccessibility(2);
        blbVar.setEllipsize(truncateAt);
        blbVar.setPadding(0, hl.L(1.0f), 0, hl.L(6.0f));
        boolean z4 = ob6.a0;
        if (z) {
            if (z4) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i10 = i9 | 80;
            float f3 = i;
            addView(blbVar, tre.d(-1, -2.0f, i10, f3, 32.0f, f3, 4.0f));
        } else {
            if (z4) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            float f4 = i;
            addView(blbVar, tre.d(-1, -2.0f, i5, f4, 32.0f, f4, 4.0f));
        }
        blb blbVar2 = new blb(this, context, vnbVar, (byte) 1);
        this.c = blbVar2;
        blbVar2.setOnLinkLongPressListener(new o66(this) {
            public final clb b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r2;
                clb clbVar = this.b;
                switch (b) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(clbVar.a);
                            return;
                        }
                        return;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            return;
                        }
                        return;
                    default:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z3;
        if (z3) {
            setMinimumHeight(hl.L(60.0f));
        } else {
            blbVar2.setLines(1);
            blbVar2.setSingleLine(true);
        }
        blbVar2.setTextSize(1, 13.0f);
        if (ob6.a0) {
            i6 = 3;
        } else {
            i6 = 5;
        }
        blbVar2.setGravity(i6);
        blbVar2.setImportantForAccessibility(2);
        blbVar2.setEllipsize(truncateAt);
        blbVar2.setPadding(0, hl.L(1.0f), 0, hl.L(6.0f));
        boolean z5 = ob6.a0;
        if (z) {
            if (z5) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            float f5 = i;
            addView(blbVar2, tre.d(-1, -2.0f, i8 | 80, f5, 32.0f, f5, 4.0f));
        } else {
            if (z5) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            float f6 = i;
            addView(blbVar2, tre.d(-1, -2.0f, i7, f6, 32.0f, f6, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public final void b(Drawable drawable, String str) {
        int L;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        if (!ob6.a0 && drawable != null) {
            L = hl.L(58.0f);
        } else {
            L = hl.L(23.0f);
        }
        marginLayoutParams.rightMargin = L;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i = 0;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        imageView.setFocusable(z);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L2 = hl.L(48.0f);
            int i2 = aob.i6;
            vnb vnbVar = this.n;
            hf0 h0 = aob.h0(L2, 0, aob.v0(i2, vnbVar));
            uob M = yob.M(i2);
            imageView.setBackground(h0);
            yob.j(imageView, h0, null, M, vnbVar);
            imageView.setImportantForAccessibility(1);
        }
        int L3 = hl.L(23.0f);
        if (drawable != null) {
            i = hl.L(48.0f);
        }
        int i3 = L3 + i;
        boolean z2 = ob6.a0;
        tpa tpaVar = this.a;
        if (z2) {
            ((ViewGroup.MarginLayoutParams) tpaVar.getLayoutParams()).leftMargin = i3;
        } else {
            ((ViewGroup.MarginLayoutParams) tpaVar.getLayoutParams()).rightMargin = i3;
        }
        tpaVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z;
        setWillNotDraw(!z);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.a.setText(charSequence);
        this.b.setText(str);
        blb blbVar = this.c;
        blbVar.setVisibility(0);
        blbVar.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i;
        if (this.e) {
            vnb vnbVar = this.n;
            if (vnbVar != null) {
                paint = vnbVar.d("paintDivider");
            } else {
                paint = aob.j0;
            }
            if (paint == null) {
                paint = aob.j0;
            }
            Paint paint2 = paint;
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.a.getText();
        CharSequence text2 = this.b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb = new StringBuilder();
            if (this.f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb.append((Object) charSequence);
            sb.append(": ");
            if (!this.f) {
                text = text2;
            }
            sb.append((Object) text);
            accessibilityNodeInfo.setText(sb.toString());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.h) {
            i2 = View.MeasureSpec.makeMeasureSpec(hl.L(60.0f) + (this.e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        blb blbVar = this.b;
        ClickableSpan b = blbVar.b(((int) motionEvent.getX()) - blbVar.getLeft(), ((int) motionEvent.getY()) - blbVar.getTop());
        boolean z2 = false;
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            tpa tpaVar = this.a;
            if (tpaVar.a(((int) motionEvent.getX()) - tpaVar.getLeft(), ((int) motionEvent.getY()) - tpaVar.getTop()) != null) {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z) {
        this.f = z;
    }

    public void setImage(Drawable drawable) {
        b(drawable, null);
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.d;
        imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            imageView.setClickable(false);
        }
    }

    @Override
    public final void updateColors() {
        int i = aob.Xc;
        vnb vnbVar = this.n;
        int a = a(aob.v0(i, vnbVar));
        tpa tpaVar = this.a;
        tpaVar.setLinkTextColor(a);
        tpaVar.setTextColor(aob.v0(aob.G6, vnbVar));
        tpaVar.invalidate();
        int a2 = a(aob.v0(i, vnbVar));
        blb blbVar = this.b;
        blbVar.setLinkTextColor(a2);
        int i2 = aob.z6;
        blbVar.setTextColor(aob.v0(i2, vnbVar));
        this.c.setTextColor(aob.v0(i2, vnbVar));
        blbVar.invalidate();
    }

    public int a(int i) {
        return i;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public clb(vnb vnbVar, Context context, boolean z) {
        this(23, vnbVar, context, z, false);
    }
}
