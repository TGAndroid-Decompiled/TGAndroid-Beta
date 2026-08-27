package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;

public abstract class l7 {

    public static c20 f13627b;

    public static c20 f13628c;
    public static c20 d;

    public static Paint f13629e;

    public static RectF f13630f;

    public static Paint f13631g;
    public static Paint h;

    public static pz0 f13632i;

    public static int f13633j;

    public static BitmapDrawable f13636m;

    public static final c20[] f13626a = new c20[2];

    public static final Paint[] f13634k = new Paint[2];

    public static final int[] f13635l = new int[2];

    public static final RectF f13637n = new RectF();

    public static final androidx.emoji2.text.n f13638o = new androidx.emoji2.text.n(1);

    public static final RectF f13639p = new RectF();

    public static final Path f13640q = new Path();

    public static final Matrix f13641r = new Matrix();

    public static final PathMeasure f13642s = new PathMeasure();

    public static final Path f13643t = new Path();

    public static void a(org.telegram.ui.ActionBar.h5 h5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            h5Var.l(string, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
        o9 o9Var = new o9();
        spannableStringBuilderValueOf.setSpan(o9Var, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
        o9Var.f13764a = h5Var;
        o9Var.f13769n = true;
        h5Var.l(spannableStringBuilderValueOf, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || v(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.f22527id));
        }
    }

    public static void c(org.telegram.ui.ActionBar.c6 c6Var) {
        if (f13629e == null) {
            Paint paint = new Paint(1);
            f13629e = paint;
            paint.setStyle(Paint.Style.STROKE);
            f13629e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            f13629e.setStrokeCap(Paint.Cap.ROUND);
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var);
        if (f13633j != iV0) {
            f13633j = iV0;
            float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(iV0);
            if (fComputePerceivedBrightness >= 0.721f) {
                f13629e.setColor(i0.b.d(0.2f, iV0, -16777216));
            } else if (fComputePerceivedBrightness < 0.25f) {
                f13629e.setColor(i0.b.d(0.2f, iV0, -1));
            } else {
                f13629e.setColor(i0.b.d(0.44f, iV0, -1));
            }
        }
    }

    public static void d(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint[] paintArr = f13634k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(!z10 ? org.telegram.ui.ActionBar.g6.f23322s8 : org.telegram.ui.ActionBar.g6.M8, c6Var);
        int[] iArr = f13635l;
        if (iArr[z10 ? 1 : 0] != iV0) {
            iArr[z10 ? 1 : 0] = iV0;
            float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(iV0);
            if (fComputePerceivedBrightness >= 0.721f) {
                paintArr[z10 ? 1 : 0].setColor(i0.b.d(0.2f, iV0, -16777216));
            } else if (fComputePerceivedBrightness < 0.25f) {
                paintArr[z10 ? 1 : 0].setColor(i0.b.d(0.2f, iV0, -1));
            } else {
                paintArr[z10 ? 1 : 0].setColor(i0.b.d(0.44f, iV0, -1));
            }
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        cq cqVar = new cq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            cqVar.setScale(0.8f, 0.8f);
        } else {
            cqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(cqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new cq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z10;
        float f15 = f11 - f10;
        if (f10 >= f12 || f11 >= f12 + f15) {
            f14 = f10;
            z10 = false;
        } else {
            f14 = f10;
            canvas.drawArc(rectF, f14, Math.min(f11, f12) - f10, false, paint);
            z10 = true;
        }
        float fMax = Math.max(f14, f13);
        float fMin = Math.min(f11, f12 + 360.0f);
        if (fMin >= fMax) {
            canvas.drawArc(rectF, fMax, fMin - fMax, false, paint);
        } else {
            if (z10) {
                return;
            }
            if (f14 <= f12 || f11 >= f13) {
                canvas.drawArc(rectF, f14, f15, false, paint);
            }
        }
    }

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, h7 h7Var) {
        i(j10, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10), h7Var);
    }

    public static void i(long j10, Canvas canvas, ImageReceiver imageReceiver, boolean z10, h7 h7Var) {
        int iR;
        int i10;
        float fLerp;
        int i11;
        float f10;
        Canvas canvas2;
        int i12;
        float f11;
        float f12;
        float f13;
        ImageReceiver imageReceiver2;
        h7 h7Var2;
        boolean z11;
        s6 s6Var;
        float f14;
        ImageReceiver imageReceiver3;
        h7 h7Var3;
        RectF rectF;
        boolean z12;
        float f15;
        float f16;
        Paint paint;
        Paint paintT;
        Paint paint2;
        Paint paint3;
        float fDpf2;
        float f17;
        float f18;
        float fZ;
        int i13;
        boolean z13;
        Paint paint4;
        Paint paint5;
        Paint paintO;
        Paint paint6;
        Paint paint7;
        float fDpf3;
        float f19;
        float fZ2;
        c20 c20Var;
        float fZ3;
        s6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z14 = h7Var.f13392b;
        RectF rectF2 = h7Var.F;
        boolean z15 = h7Var.E;
        if (h7Var.f13411x != j10) {
            h7Var.f13411x = j10;
            h7Var.g();
            z14 = false;
        }
        boolean z16 = storiesController.f13962j.get(j10, 0) == 1;
        boolean z17 = ChatObject.isForum(UserConfig.selectedAccount, j10) && !h7Var.D;
        boolean z18 = h7Var.f13406r ? !storiesController.h.isEmpty() : z10;
        if (h7Var.d != null) {
            storiesController.D(h7Var.f13393c, j10);
            z16 = false;
        }
        if (z16) {
            iR = storiesController.I(j10) ? 2 : r(storiesController, j10);
            i10 = 3;
            z14 = false;
        } else if (z18) {
            if (h7Var.f13391a) {
                iR = 2;
            } else {
                iR = storiesController.D(h7Var.f13393c, j10);
                if (iR != 0) {
                    i10 = 1;
                }
            }
            i10 = 2;
        } else {
            iR = r(storiesController, j10);
            i10 = iR;
        }
        int i14 = h7Var.f13413z;
        if (i14 != 0) {
            iR = i14;
            i10 = iR;
        }
        int i15 = h7Var.f13412y;
        if (i15 != i10) {
            if (i15 == 3) {
                z14 = true;
            }
            if (i10 == 3) {
                h7Var.f13405q = iR;
                h7Var.f13408t = 0.0f;
            }
            if (z14) {
                h7Var.A = i15;
                h7Var.f13412y = i10;
                h7Var.B = 0.0f;
            } else {
                h7Var.f13412y = i10;
                h7Var.B = 1.0f;
            }
        }
        nc ncVar = h7Var.H;
        float fA = ncVar != null ? ncVar.a(0.08f) : 1.0f;
        if (h7Var.C != z16 && z16) {
            h7Var.K = 1.0f;
            h7Var.L = false;
        }
        h7Var.C = z16;
        if (h7Var.f13412y == 0 && h7Var.B == 1.0f) {
            imageReceiver.setImageCoords(rectF2);
            canvas.save();
            canvas.scale(fA, fA, rectF2.centerX(), rectF2.centerY());
            imageReceiver.draw(canvas);
            canvas.restore();
            return;
        }
        int iSave = canvas.save();
        if (fA != 1.0f) {
            canvas.scale(fA, fA, rectF2.centerX(), rectF2.centerY());
        }
        float f20 = storiesController.F(h7Var.f13411x) ? h7Var.f13394e : 0.0f;
        float interpolation = h7Var.B;
        if (interpolation != 1.0f) {
            interpolation = er.f28122f.getInterpolation(interpolation);
        }
        float f21 = interpolation;
        if (!z15 || h7Var.v) {
            int i16 = h7Var.A;
            int i17 = h7Var.f13405q;
            if (i16 == 3) {
                i16 = i17;
            }
            int iDp = i16 == 2 ? AndroidUtilities.dp(3.0f) : i16 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            int i18 = h7Var.f13412y;
            int i19 = h7Var.f13405q;
            if (i18 == 3) {
                i18 = i19;
            }
            fLerp = AndroidUtilities.lerp(iDp, i18 == 2 ? AndroidUtilities.dp(3.0f) : i18 == 1 ? AndroidUtilities.dp(4.0f) : 0, h7Var.B);
        } else {
            fLerp = 0.0f;
        }
        RectF rectF3 = f13637n;
        if (fLerp == 0.0f) {
            imageReceiver.setImageCoords(rectF2);
        } else {
            rectF3.set(rectF2);
            rectF3.inset(fLerp, fLerp);
            imageReceiver.setImageCoords(rectF3);
        }
        if (f20 > 0.0f) {
            f11 = 1.0f;
            int i20 = iR;
            f10 = fLerp;
            i12 = 3;
            canvas2 = canvas;
            i11 = i20;
            f12 = 0.08f;
            canvas2.saveLayerAlpha(rectF3.left - AndroidUtilities.dp(15.0f), rectF3.top - AndroidUtilities.dp(15.0f), rectF3.right + AndroidUtilities.dp(15.0f), rectF3.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            i11 = iR;
            f10 = fLerp;
            canvas2 = canvas;
            i12 = 3;
            f11 = 1.0f;
            f12 = 0.08f;
        }
        int i21 = h7Var.A;
        c20[] c20VarArr = f13626a;
        if ((i21 == 1 && h7Var.B != f11) || h7Var.f13412y == 1) {
            if (i11 == 2) {
                o(imageReceiver);
                c20Var = f13627b;
            } else if (i11 == i12) {
                q(imageReceiver);
                c20Var = f13628c;
            } else {
                t(imageReceiver, z15);
                c20Var = c20VarArr[z15 ? 1 : 0];
            }
            boolean z19 = h7Var.A == 1 && h7Var.B != f11;
            float f22 = (!z15 || h7Var.v) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z19) {
                fZ3 = (AndroidUtilities.dp(5.0f) * f21) + f22;
                c20Var.f27292c.setAlpha((int) ((f11 - f21) * h7Var.f13409u * 255.0f));
            } else {
                c20Var.f27292c.setAlpha((int) (h7Var.f13409u * 255.0f * f21));
                fZ3 = com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(5.0f), f22);
            }
            float f23 = fZ3 + h7Var.G;
            rectF3.set(rectF2);
            rectF3.inset(f23, f23);
            imageReceiver.getParentView();
            j(canvas2, h7Var, c20Var.f27292c, z17);
        }
        int i22 = h7Var.A;
        Paint[] paintArr = f13634k;
        if (i22 == 2) {
            f13 = 1.0f;
            if (h7Var.B != 1.0f) {
                if (i22 == 2 || h7Var.B == f13) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z15) {
                    d(h7Var.J, h7Var.f13403o);
                    paint4 = paintArr[h7Var.f13403o ? 1 : 0];
                } else {
                    c(h7Var.J);
                    paint4 = f13629e;
                }
                paint5 = paint4;
                if (h7Var.f13391a) {
                    Paint paintT2 = t(imageReceiver, z15);
                    paintT2.setAlpha((int) (h7Var.f13409u * 255.0f));
                    paintO = o(imageReceiver);
                    paintO.setAlpha((int) (h7Var.f13409u * 255.0f));
                    Paint paintQ = q(imageReceiver);
                    paintQ.setAlpha((int) (h7Var.f13409u * 255.0f));
                    c(h7Var.J);
                    paint7 = paintQ;
                    paint6 = paintT2;
                } else {
                    paintO = null;
                    paint6 = null;
                    paint7 = null;
                }
                if (h7Var.f13391a) {
                    if (z15 || h7Var.v) {
                        f19 = 0.0f;
                    } else {
                        fDpf3 = AndroidUtilities.dpf2(3.5f);
                        f19 = -fDpf3;
                    }
                } else if (z15 || h7Var.v) {
                    f19 = 0.0f;
                } else {
                    fDpf3 = AndroidUtilities.dpf2(2.7f);
                    f19 = -fDpf3;
                }
                if (z13) {
                    fZ2 = (AndroidUtilities.dp(5.0f) * f21) + f19;
                    paint5.setAlpha((int) (h7Var.f13409u * 255.0f * (1.0f - f21)));
                    f14 = 2.7f;
                } else {
                    paint5.setAlpha((int) (h7Var.f13409u * 255.0f * f21));
                    f14 = 2.7f;
                    fZ2 = com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(5.0f), f19);
                }
                float f24 = fZ2 + h7Var.G;
                rectF3.set(rectF2);
                rectF3.inset(f24, f24);
                if (h7Var.f13391a) {
                    imageReceiver2 = imageReceiver;
                    s6Var = storiesController;
                    Paint paint8 = paintO;
                    h7Var2 = h7Var;
                    z11 = z17;
                    m(canvas2, s6Var, imageReceiver2, h7Var2, paint5, paint6, paint7, paint8, z11);
                } else {
                    imageReceiver2 = imageReceiver;
                    h7Var2 = h7Var;
                    z11 = z17;
                    s6Var = storiesController;
                    imageReceiver2.getParentView();
                    j(canvas2, h7Var2, paint5, z11);
                }
            }
            if ((h7Var2.A != i12 && h7Var2.B != 1.0f) || h7Var2.f13412y == i12) {
                if (h7Var2.f13405q == 1) {
                    t(imageReceiver2, z15);
                    paint = c20VarArr[z15 ? 1 : 0].f27292c;
                } else if (z15) {
                    d(h7Var2.J, h7Var2.f13403o);
                    paint = paintArr[h7Var2.f13403o ? 1 : 0];
                } else {
                    c(h7Var2.J);
                    paint = f13629e;
                }
                paint.setAlpha((int) (f21 * 255.0f));
                if (h7Var2.f13391a) {
                    paintT = t(imageReceiver2, z15);
                    paintT.setAlpha((int) (h7Var2.f13409u * 255.0f));
                    Paint paintO2 = o(imageReceiver2);
                    paintO2.setAlpha((int) (h7Var2.f13409u * 255.0f));
                    Paint paintQ2 = q(imageReceiver2);
                    paintQ2.setAlpha((int) (h7Var2.f13409u * 255.0f));
                    c(h7Var2.J);
                    paint3 = paintO2;
                    paint2 = paintQ2;
                } else {
                    paintT = null;
                    paint2 = null;
                    paint3 = null;
                }
                if (h7Var2.f13391a) {
                    if (!z15 || h7Var2.v) {
                        f17 = 0.0f;
                    } else {
                        fDpf2 = AndroidUtilities.dpf2(3.5f);
                        f17 = -fDpf2;
                    }
                } else if (!z15 || h7Var2.v) {
                    f17 = 0.0f;
                } else {
                    fDpf2 = AndroidUtilities.dpf2(f14);
                    f17 = -fDpf2;
                }
                if (h7Var2.A != i12 || h7Var2.B == 1.0f) {
                    paint.setAlpha((int) (h7Var2.f13409u * 255.0f * f21));
                    f18 = 1.0f;
                    fZ = com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(5.0f), f17);
                } else {
                    fZ = (AndroidUtilities.dp(7.0f) * f21) + f17;
                    paint.setAlpha((int) ((1.0f - f21) * h7Var2.f13409u * 255.0f));
                    f18 = 1.0f;
                }
                float f25 = fZ + h7Var2.G;
                rectF3.set(rectF2);
                rectF3.inset(f25, f25);
                boolean z20 = h7Var2.f13391a;
                if (z20 && h7Var2.f13412y == i12) {
                    float f26 = h7Var2.f13408t;
                    if (f26 != f18) {
                        float f27 = f26 + f12;
                        h7Var2.f13408t = f27;
                        if (f27 > f18) {
                            h7Var2.f13408t = f18;
                        }
                        float f28 = h7Var2.f13394e;
                        h7Var2.f13394e = f18 - h7Var2.f13408t;
                        m(canvas2, s6Var, imageReceiver2, h7Var2, paint, paintT, paint2, paint3, z11);
                        imageReceiver3 = imageReceiver2;
                        h7Var3 = h7Var2;
                        h7Var3.f13394e = f28;
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                        canvas2 = canvas;
                    }
                    imageReceiver3.draw(canvas2);
                    if (f20 > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h7Var3.f13410w = z12;
                    if (f20 > 0.0f) {
                        float f29 = f10 + h7Var3.G;
                        rectF.set(rectF2);
                        rectF.inset(f29, f29);
                        k(canvas2, rectF, f20, imageReceiver3.getVisible(), 0.0f);
                    }
                    f15 = h7Var3.B;
                    if (f15 != 1.0f) {
                        f16 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
                        h7Var3.B = f16;
                        if (f16 > 1.0f) {
                            h7Var3.B = 1.0f;
                        }
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                    }
                    if (iSave != 0) {
                        canvas2.restoreToCount(iSave);
                    }
                }
                h7Var3 = h7Var2;
                Paint paint9 = paint3;
                imageReceiver3 = imageReceiver2;
                if (z20) {
                    int iD = s6Var.D(0, h7Var3.f13411x);
                    if (iD == 2) {
                        paintT = paint9;
                    } else if (iD == i12) {
                        paintT = paint2;
                    } else if (iD != 1) {
                        paintT = paint;
                    }
                } else {
                    paintT = paint;
                }
                View parentView = imageReceiver3.getParentView();
                if (!h7Var3.L) {
                    float f30 = h7Var3.K - 0.016f;
                    h7Var3.K = f30;
                    if (f30 < 0.0f) {
                        h7Var3.K = 0.0f;
                        h7Var3.L = true;
                    }
                    h7Var3.M += 1.152f;
                    parentView.invalidate();
                    if (h7Var3.L) {
                        rectF = rectF3;
                        canvas.drawArc(rectF, h7Var3.M, h7Var3.K * 360.0f, false, paintT);
                    } else {
                        rectF = rectF3;
                        canvas.drawArc(rectF, h7Var3.M + 360.0f, h7Var3.K * (-360.0f), false, paintT);
                    }
                    for (i13 = 0; i13 < 16; i13++) {
                        float f31 = (i13 * 22.5f) + 10.0f;
                        canvas.drawArc(rectF, h7Var3.M + f31, ((22.5f + f31) - 10.0f) - f31, false, paintT);
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    if (f20 > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h7Var3.f13410w = z12;
                    if (f20 > 0.0f) {
                        float f210 = f10 + h7Var3.G;
                        rectF.set(rectF2);
                        rectF.inset(f210, f210);
                        k(canvas2, rectF, f20, imageReceiver3.getVisible(), 0.0f);
                    }
                    f15 = h7Var3.B;
                    if (f15 != 1.0f) {
                        f16 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
                        h7Var3.B = f16;
                        if (f16 > 1.0f) {
                            h7Var3.B = 1.0f;
                        }
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                    }
                    if (iSave != 0) {
                        canvas2.restoreToCount(iSave);
                    }
                }
                float f32 = h7Var3.K + 0.016f;
                h7Var3.K = f32;
                if (f32 >= 1.0f) {
                    h7Var3.K = 1.0f;
                    h7Var3.L = false;
                }
                h7Var3.M += 1.152f;
                parentView.invalidate();
                if (h7Var3.L) {
                    rectF = rectF3;
                    canvas.drawArc(rectF, h7Var3.M, h7Var3.K * 360.0f, false, paintT);
                } else {
                    rectF = rectF3;
                    canvas.drawArc(rectF, h7Var3.M + 360.0f, h7Var3.K * (-360.0f), false, paintT);
                }
                while (i13 < 16) {
                    float f33 = (i13 * 22.5f) + 10.0f;
                    canvas.drawArc(rectF, h7Var3.M + f33, ((22.5f + f33) - 10.0f) - f33, false, paintT);
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                if (f20 > 0.5f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h7Var3.f13410w = z12;
                if (f20 > 0.0f) {
                    float f211 = f10 + h7Var3.G;
                    rectF.set(rectF2);
                    rectF.inset(f211, f211);
                    k(canvas2, rectF, f20, imageReceiver3.getVisible(), 0.0f);
                }
                f15 = h7Var3.B;
                if (f15 != 1.0f) {
                    f16 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
                    h7Var3.B = f16;
                    if (f16 > 1.0f) {
                        h7Var3.B = 1.0f;
                    }
                    if (imageReceiver3.getParentView() != null) {
                        imageReceiver3.invalidate();
                        imageReceiver3.getParentView().invalidate();
                    }
                }
                if (iSave != 0) {
                    canvas2.restoreToCount(iSave);
                }
            }
            imageReceiver3 = imageReceiver2;
            h7Var3 = h7Var2;
            rectF = rectF3;
            imageReceiver3.draw(canvas2);
            if (f20 > 0.5f) {
                z12 = true;
            } else {
                z12 = false;
            }
            h7Var3.f13410w = z12;
            if (f20 > 0.0f) {
                float f212 = f10 + h7Var3.G;
                rectF.set(rectF2);
                rectF.inset(f212, f212);
                k(canvas2, rectF, f20, imageReceiver3.getVisible(), 0.0f);
            }
            f15 = h7Var3.B;
            if (f15 != 1.0f) {
                f16 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
                h7Var3.B = f16;
                if (f16 > 1.0f) {
                    h7Var3.B = 1.0f;
                }
                if (imageReceiver3.getParentView() != null) {
                    imageReceiver3.invalidate();
                    imageReceiver3.getParentView().invalidate();
                }
            }
            if (iSave != 0) {
                canvas2.restoreToCount(iSave);
            }
        }
        f13 = 1.0f;
        if (h7Var.f13412y == 2) {
            if (i22 == 2) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z15) {
                d(h7Var.J, h7Var.f13403o);
                paint4 = paintArr[h7Var.f13403o ? 1 : 0];
            } else {
                c(h7Var.J);
                paint4 = f13629e;
            }
            paint5 = paint4;
            if (h7Var.f13391a) {
                Paint paintT3 = t(imageReceiver, z15);
                paintT3.setAlpha((int) (h7Var.f13409u * 255.0f));
                paintO = o(imageReceiver);
                paintO.setAlpha((int) (h7Var.f13409u * 255.0f));
                Paint paintQ3 = q(imageReceiver);
                paintQ3.setAlpha((int) (h7Var.f13409u * 255.0f));
                c(h7Var.J);
                paint7 = paintQ3;
                paint6 = paintT3;
            } else {
                paintO = null;
                paint6 = null;
                paint7 = null;
            }
            if (h7Var.f13391a) {
                if (z15) {
                }
                f19 = 0.0f;
            } else {
                if (z15) {
                }
                f19 = 0.0f;
            }
            if (z13) {
                fZ2 = (AndroidUtilities.dp(5.0f) * f21) + f19;
                paint5.setAlpha((int) (h7Var.f13409u * 255.0f * (1.0f - f21)));
                f14 = 2.7f;
            } else {
                paint5.setAlpha((int) (h7Var.f13409u * 255.0f * f21));
                f14 = 2.7f;
                fZ2 = com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(5.0f), f19);
            }
            float f213 = fZ2 + h7Var.G;
            rectF3.set(rectF2);
            rectF3.inset(f213, f213);
            if (h7Var.f13391a) {
                imageReceiver2 = imageReceiver;
                s6Var = storiesController;
                Paint paint10 = paintO;
                h7Var2 = h7Var;
                z11 = z17;
                m(canvas2, s6Var, imageReceiver2, h7Var2, paint5, paint6, paint7, paint10, z11);
            } else {
                imageReceiver2 = imageReceiver;
                h7Var2 = h7Var;
                z11 = z17;
                s6Var = storiesController;
                imageReceiver2.getParentView();
                j(canvas2, h7Var2, paint5, z11);
            }
        } else {
            imageReceiver2 = imageReceiver;
            h7Var2 = h7Var;
            z11 = z17;
            s6Var = storiesController;
            f14 = 2.7f;
        }
        if (h7Var2.A != i12) {
            imageReceiver3 = imageReceiver2;
            h7Var3 = h7Var2;
        } else {
            imageReceiver3 = imageReceiver2;
            h7Var3 = h7Var2;
        }
        rectF = rectF3;
        imageReceiver3.draw(canvas2);
        if (f20 > 0.5f) {
            z12 = true;
        } else {
            z12 = false;
        }
        h7Var3.f13410w = z12;
        if (f20 > 0.0f) {
            float f214 = f10 + h7Var3.G;
            rectF.set(rectF2);
            rectF.inset(f214, f214);
            k(canvas2, rectF, f20, imageReceiver3.getVisible(), 0.0f);
        }
        f15 = h7Var3.B;
        if (f15 != 1.0f) {
            f16 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
            h7Var3.B = f16;
            if (f16 > 1.0f) {
                h7Var3.B = 1.0f;
            }
            if (imageReceiver3.getParentView() != null) {
                imageReceiver3.invalidate();
                imageReceiver3.getParentView().invalidate();
            }
        }
        if (iSave != 0) {
            canvas2.restoreToCount(iSave);
        }
    }

    public static void j(Canvas canvas, h7 h7Var, Paint paint, boolean z10) {
        RectF rectF = f13637n;
        if (z10) {
            RectF rectF2 = f13639p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f10 = h7Var.f13395f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f10, boolean z10, float f11) {
        Canvas canvas2;
        if (f13632i == null) {
            f13632i = new pz0(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (f13631g == null) {
            Paint paint = new Paint(1);
            f13631g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f13630f == null) {
            f13630f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.g6.l1(f10, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false)));
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f11);
        float fL = f13632i.l() + fLerp + fLerp;
        float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f11);
        float fDp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f12 = fL / 2.0f;
        float f13 = 0.8f * fLerp2;
        float f14 = fLerp2 * 0.2f;
        f13630f.set((rectF.centerX() - f12) - fDp, (rectF.bottom - f13) - fDp, rectF.centerX() + f12 + fDp, rectF.bottom + f14 + fDp);
        float fLerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        canvas.scale(fLerp3, fLerp3, f13630f.centerX(), f13630f.centerY());
        AndroidUtilities.scaleRect(f13630f, f10);
        RectF rectF2 = f13630f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f13630f.height() / 2.0f, f13631g);
        if (z10) {
            f13630f.set(rectF.centerX() - f12, rectF.bottom - f13, rectF.centerX() + f12, rectF.bottom + f14);
            RectF rectF3 = f13630f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f13630f.height() / 2.0f, h);
            pz0 pz0Var = f13632i;
            RectF rectF4 = f13630f;
            canvas2 = canvas;
            pz0Var.c(rectF4.left + fLerp, rectF4.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, h7 h7Var, boolean z10) {
        if (z10) {
            float fHeight = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = f13640q;
            path.rewind();
            path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
            Matrix matrix = f13641r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f13642s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f13643t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!h7Var.f13399k) {
            if (h7Var.f13400l) {
                float f14 = h7Var.f13395f;
                g(canvas, rectF, paint, f10, f11, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
                return;
            } else if (f10 < 90.0f) {
                g(canvas, rectF, paint, f10, f11, h7Var.f13396g, h7Var.h);
                return;
            } else {
                g(canvas, rectF, paint, f10, f11, -h7Var.f13397i, h7Var.f13398j);
                return;
            }
        }
        boolean z11 = h7Var.f13401m;
        if (!z11 && !h7Var.f13400l) {
            if (f10 < 90.0f) {
                float f15 = h7Var.f13395f;
                g(canvas, rectF, paint, f10, f11, (-f15) / 2.0f, f15 / 2.0f);
                return;
            } else {
                float f16 = h7Var.f13395f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
                return;
            }
        }
        if (h7Var.f13400l) {
            float f17 = h7Var.f13395f;
            g(canvas, rectF, paint, f10, f11, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (!z11) {
            canvas.drawArc(rectF, f10, f11 - f10, false, paint);
        } else {
            float f18 = h7Var.f13395f;
            g(canvas, rectF, paint, f10, f11, (-f18) / 2.0f, f18 / 2.0f);
        }
    }

    public static void m(Canvas canvas, s6 s6Var, ImageReceiver imageReceiver, h7 h7Var, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z10) {
        Paint paint5;
        Paint paint6;
        Paint paint7;
        h7 h7Var2 = h7Var;
        org.telegram.ui.ActionBar.c6 c6Var = h7Var2.J;
        boolean z11 = h7Var2.E;
        c(c6Var);
        d(h7Var2.J, h7Var2.f13403o);
        long j10 = h7Var2.f13407s;
        int i10 = 0;
        int iD = j10 != 0 ? s6Var.D(0, j10) : s6Var.D(0, h7Var2.f13411x);
        int i11 = 2;
        h7Var2.f13402n = iD == 0 ? 2 : 1;
        TL_stories.PeerStories peerStoriesY = s6Var.y(h7Var2.f13411x);
        ArrayList arrayList = s6Var.h;
        if (peerStoriesY == null) {
            peerStoriesY = s6Var.z(h7Var2.f13411x);
        }
        TL_stories.PeerStories peerStories = peerStoriesY;
        int size = h7Var2.f13406r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = f13634k;
        if (iD == 2) {
            o(imageReceiver);
            paint5 = f13627b.f27292c;
        } else if (iD == 3) {
            q(imageReceiver);
            paint5 = f13628c.f27292c;
        } else if (iD == 1) {
            t(imageReceiver, z11);
            paint5 = f13626a[z11 ? 1 : 0].f27292c;
        } else {
            paint5 = z11 ? paintArr[h7Var2.f13403o ? 1 : 0] : f13629e;
        }
        Paint paint8 = paint5;
        RectF rectF = f13637n;
        if (size <= 1) {
            long j11 = h7Var2.f13411x;
            TL_stories.PeerStories peerStoriesZ = (TL_stories.PeerStories) s6Var.f13961i.f(j11);
            if (peerStoriesZ == null) {
                peerStoriesZ = s6Var.z(j11);
            }
            if (peerStoriesZ != null) {
                if (j11 == UserConfig.getInstance(s6Var.f13955a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) s6Var.f13956b.f(j11))) {
                    i10 = 1;
                    break;
                }
                for (int i12 = 0; i12 < peerStoriesZ.stories.size(); i12++) {
                    TL_stories.StoryItem storyItem = peerStoriesZ.stories.get(i12);
                    if (storyItem != null) {
                        if (!(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                            if (storyItem.f22617id > peerStoriesZ.max_read_id) {
                                i10 = 1;
                                break;
                            }
                        } else {
                            i10 = 2;
                            break;
                        }
                    }
                }
            }
            if (i10 == 2) {
                paint7 = paint3;
            } else if (paint8 == f13627b.f27292c) {
                paint7 = paint4;
            } else {
                paint7 = i10 == 1 ? paint2 : paint;
            }
            l(canvas, rectF, paint7, -90.0f, 90.0f, h7Var2, z10);
            l(canvas, rectF, paint7, 90.0f, 270.0f, h7Var, z10);
            float f10 = h7Var.f13394e;
            if (f10 == 1.0f || paint7 == paint8) {
                return;
            }
            paint8.setAlpha((int) ((1.0f - f10) * 255.0f));
            l(canvas, rectF, paint8, -90.0f, 90.0f, h7Var, z10);
            l(canvas, rectF, paint8, 90.0f, 270.0f, h7Var, z10);
            paint8.setAlpha(255);
            return;
        }
        RectF rectF2 = rectF;
        Paint paint9 = paint8;
        float f11 = 360.0f / size;
        float f12 = (size > 20 ? 3 : 5) * h7Var2.f13394e;
        float f13 = f12 > f11 ? 0.0f : f12;
        int iMax = h7Var2.f13406r ? 0 : Math.max(peerStories.max_read_id, s6Var.f13959f.get(h7Var2.f13411x, 0));
        int i13 = 0;
        while (i13 < size) {
            Paint paint10 = z11 ? paintArr[h7Var2.f13403o ? 1 : 0] : f13629e;
            if (h7Var2.f13406r) {
                int iD2 = s6Var.D(i10, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((size - 1) - i13)).peer));
                if (iD2 == i11) {
                    paint10 = paint4;
                } else if (iD2 == 3) {
                    paint10 = paint3;
                } else if (iD2 == 1) {
                    paint10 = paint2;
                }
            } else if (i13 >= peerStories.stories.size()) {
                paint10 = paint2;
            } else if (peerStories.stories.get(i13).justUploaded || peerStories.stories.get(i13).f22617id > iMax) {
                if (peerStories.stories.get(i13).media instanceof TLRPC.TL_messageMediaVideoStream) {
                    paint10 = paint3;
                } else if (peerStories.stories.get(i13).close_friends) {
                    paint10 = paint4;
                } else {
                    paint10 = paint2;
                }
            }
            float f14 = (i13 * f11) - 90.0f;
            float f15 = f14 + f11;
            float f16 = f14 + f13;
            float f17 = f15 - f13;
            Paint paint11 = paint9;
            int i14 = iMax;
            int i15 = i13;
            Paint paint12 = paint10;
            RectF rectF3 = rectF2;
            l(canvas, rectF3, paint12, f16, f17, h7Var, z10);
            RectF rectF4 = rectF3;
            if (h7Var.f13394e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - h7Var.f13394e) * 255.0f));
                l(canvas, rectF4, paint11, f16, f17, h7Var, z10);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(255);
            }
            i13 = i15 + 1;
            h7Var2 = h7Var;
            rectF2 = rectF4;
            paint9 = paint6;
            iMax = i14;
            i10 = 0;
            i11 = 2;
        }
    }

    public static i7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        s6 s6Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i10 = s6Var.f13959f.get(DialogObject.getPeerDialogId(peerStories.peer));
        int i11 = 0;
        while (true) {
            if (i11 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i11).f22617id > i10) {
                storyItem = peerStories.stories.get(i11);
                break;
            }
            i11++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia == null || messageMedia.document == null) {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                runnable.run();
                return null;
            }
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), "", false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
        } else {
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
            if (pathToAttach2 != null && pathToAttach2.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
            if (pathToAttach3 != null) {
                try {
                    int iLastIndexOf = pathToAttach3.getName().lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        File file = new File(pathToAttach3.getParentFile(), pathToAttach3.getName().substring(0, iLastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        i7 i7Var = new i7();
        i7Var.d = false;
        i7Var.f13453a = peerDialogId;
        i7Var.f13454b = s6Var;
        i7Var.f13455c = new p6(9, i7Var, runnable);
        Runnable[] runnableArr = {p6Var};
        p6 p6Var = new p6(10, runnableArr, i7Var);
        AndroidUtilities.runOnUIThread(p6Var, 3000L);
        g7 g7Var = new g7(runnableArr, i7Var);
        i7Var.f13456e = g7Var;
        g7Var.setAllowLoadingOnAttachedOnly(true);
        i7Var.f13456e.onAttachedToWindow();
        String strS = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                i7Var.f13455c.run();
                return null;
            }
            i7Var.f13456e.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), strS, null, null, null, 0L, null, storyItem2, 0);
        } else {
            i7Var.f13456e.setImage(ImageLocation.getForDocument(document), s3.c.l(strS, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return i7Var;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f13627b == null) {
            c20 c20Var = new c20();
            f13627b = c20Var;
            c20Var.f27290a = true;
            c20Var.f27291b = true;
            c20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
            f13627b.f27292c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f13627b.f27292c.setStyle(Paint.Style.STROKE);
            f13627b.f27292c.setStrokeCap(Paint.Cap.ROUND);
        }
        f13627b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f13627b.f27292c;
    }

    public static Drawable p() {
        if (f13636m == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.b.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f13636m = new BitmapDrawable(bitmapCreateBitmap);
        }
        return f13636m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f13628c == null) {
            c20 c20Var = new c20();
            f13628c = c20Var;
            c20Var.f27290a = true;
            c20Var.f27291b = true;
            c20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
            f13628c.f27292c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f13628c.f27292c.setStyle(Paint.Style.STROKE);
            f13628c.f27292c.setStrokeCap(Paint.Cap.ROUND);
        }
        f13628c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f13628c.f27292c;
    }

    public static int r(s6 s6Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j10 == 0) {
            return 0;
        }
        if (j10 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
            if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
                return 0;
            }
            int i10 = s6Var.f13959f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = chat.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i10 ? 1 : 2;
        }
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
        if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
            return 0;
        }
        int i11 = s6Var.f13959f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = user.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i11 ? 1 : 2;
    }

    public static String s() {
        int iMax = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return com.google.android.recaptcha.internal.a.l(iMax, "_", iMax);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        c20[] c20VarArr = f13626a;
        if (c20VarArr[z10 ? 1 : 0] == null) {
            c20 c20Var = new c20();
            c20VarArr[z10 ? 1 : 0] = c20Var;
            c20Var.f27290a = true;
            c20Var.f27291b = true;
            if (z10) {
                c20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
            } else {
                c20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
            }
            c20VarArr[z10 ? 1 : 0].f27292c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            c20VarArr[z10 ? 1 : 0].f27292c.setStyle(Paint.Style.STROKE);
            c20VarArr[z10 ? 1 : 0].f27292c.setStrokeCap(Paint.Cap.ROUND);
        }
        c20VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return c20VarArr[z10 ? 1 : 0].f27292c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.StoryEditing) : LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
        o9 o9Var = new o9();
        spannableStringBuilderValueOf.setSpan(o9Var, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
        o9Var.f13764a = textView;
        o9Var.f13769n = false;
        return spannableStringBuilderValueOf;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static boolean w(int i10, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i10).getCurrentTime() > storyItem.expire_date;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, Integer.MAX_VALUE), storyItem.media.document), "320_320", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new n9(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(i0.b.d(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(bitmapCreateBitmap);
            imageReceiver.addDecorator(new n9(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new n9(storyItem));
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1000), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        }
    }
}
