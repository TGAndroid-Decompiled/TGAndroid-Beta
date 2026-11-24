package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.a;
public final class sqb extends Drawable {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public int e;
    public int f;
    public Drawable g;
    public int h;
    public final Context i;
    public final ylb j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ColorFilter n;

    public sqb(Context context, ylb ylbVar) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f = -1;
        this.i = context;
        this.j = ylbVar;
        textPaint.setTypeface(gm.n1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(gm.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static sqb a(int i) {
        sqb sqbVar = new sqb(a.b, null);
        sqbVar.b(i);
        sqbVar.l = true;
        return sqbVar;
    }

    public final void b(int i) {
        int i2;
        String valueOf;
        if (this.f != i) {
            this.f = i;
            boolean z = this.m;
            Context context = this.i;
            if (z) {
                this.g = context.getDrawable(2131232071).mutate();
            } else {
                if (i == 0) {
                    i2 = 2131232236;
                } else {
                    i2 = 2131232237;
                }
                Drawable mutate = context.getDrawable(i2).mutate();
                this.g = mutate;
                mutate.setColorFilter(this.n);
            }
            invalidateSelf();
            int i3 = this.f;
            if (i3 >= 1 && i3 < 60) {
                valueOf = String.valueOf(i);
                if (valueOf.length() < 2) {
                    valueOf = valueOf.concat(jb6.M0(2131745422, null));
                }
            } else if (i3 >= 60 && i3 < 3600) {
                valueOf = String.valueOf(i / 60);
                if (valueOf.length() < 2) {
                    valueOf = valueOf.concat(jb6.M0(2131745424, null));
                }
            } else if (i3 >= 3600 && i3 < 86400) {
                valueOf = String.valueOf((i / 60) / 60);
                if (valueOf.length() < 2) {
                    valueOf = valueOf.concat(jb6.M0(2131745425, null));
                }
            } else if (i3 >= 86400 && i3 < 604800) {
                valueOf = String.valueOf(((i / 60) / 60) / 24);
                if (valueOf.length() < 2) {
                    valueOf = valueOf.concat(jb6.M0(2131745426, null));
                }
            } else if (i3 < 2678400) {
                valueOf = String.valueOf((((i / 60) / 60) / 24) / 7);
                if (valueOf.length() < 2) {
                    valueOf = valueOf.concat(jb6.M0(2131745421, null));
                } else if (valueOf.length() > 2) {
                    valueOf = "c";
                }
            } else if (i3 < 31449600) {
                valueOf = String.valueOf((((i / 60) / 60) / 24) / 30);
                if (valueOf.length() < 2) {
                    valueOf = valueOf.concat(jb6.M0(2131745423, null));
                }
            } else {
                valueOf = String.valueOf((((i / 60) / 60) / 24) / 364);
                if (valueOf.length() < 2) {
                    valueOf = valueOf.concat(jb6.M0(2131745420, null));
                }
            }
            String str = valueOf;
            TextPaint textPaint = this.a;
            textPaint.setTextSize(gm.L(11.0f));
            float measureText = textPaint.measureText(str);
            this.d = measureText;
            if (measureText > gm.L(13.0f)) {
                textPaint.setTextSize(gm.L(9.0f));
                this.d = textPaint.measureText(str);
            }
            if (this.d > gm.L(13.0f)) {
                textPaint.setTextSize(gm.L(6.0f));
                this.d = textPaint.measureText(str);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str, textPaint, (int) Math.ceil(this.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e) {
                this.c = null;
                fc4.g(e, true);
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L = gm.L(23.0f);
        int L2 = gm.L(23.0f);
        boolean z = this.m;
        Paint paint = this.b;
        int i = -1;
        TextPaint textPaint = this.a;
        ylb ylbVar = this.j;
        if (z) {
            textPaint.setColor(-1);
        } else if (!this.l) {
            if (!this.k) {
                paint.setColor(cmb.v0(cmb.r8, ylbVar));
            }
            textPaint.setColor(cmb.v0(cmb.z8, ylbVar));
        } else {
            textPaint.setColor(cmb.v0(cmb.E8, ylbVar));
        }
        if (this.g != null) {
            if (!this.l && !this.m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int v0 = cmb.v0(cmb.z8, ylbVar);
                if (this.h != v0) {
                    this.h = v0;
                    this.g.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.m) {
                this.g.setBounds(getBounds().left, getBounds().top, this.g.getIntrinsicWidth() + getBounds().left, this.g.getIntrinsicHeight() + getBounds().top);
                this.g.draw(canvas);
            } else {
                Rect rect = gm.Q;
                rect.set(getBounds().centerX() - gm.L(10.5f), getBounds().centerY() - gm.L(10.5f), this.g.getIntrinsicWidth() + (getBounds().centerX() - gm.L(10.5f)), this.g.getIntrinsicHeight() + (getBounds().centerY() - gm.L(10.5f)));
                this.g.setBounds(rect);
                this.g.draw(canvas);
            }
        }
        if (this.f != 0 && this.c != null) {
            if (gm.p != 3.0f) {
                i = 0;
            }
            canvas.save();
            if (this.m) {
                canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i), (getBounds().height() - this.e) / 2.0f);
                this.c.draw(canvas);
            } else {
                canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i, (L2 - this.e) / 2.0f);
                this.c.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(23.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(23.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.n = colorFilter;
        if (this.l) {
            this.g.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i) {
    }
}
