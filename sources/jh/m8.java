package jh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import hh.y9;
import java.util.ArrayList;
import java.util.Random;
import lh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.rn;
import org.telegram.ui.ry;
import org.telegram.ui.sy;

public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final Path A;
    public Bitmap B;
    public boolean C;

    public k8 f13658a;

    public k8 f13659b;

    public lh.w3 f13660c;
    public final FrameLayout d;

    public final Matrix f13661e;

    public final float[] f13662f;
    public final View h;

    public final org.telegram.ui.ActionBar.c6 f13663n;

    public ArrayList f13664r;

    public final Rect f13665s;
    public final RectF v;

    public final Paint f13666w;

    public final org.telegram.ui.Components.y5 f13667x;

    public final org.telegram.ui.Components.y5 f13668y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13658a = null;
        this.f13659b = null;
        this.f13660c = null;
        this.f13661e = new Matrix();
        this.f13662f = new float[2];
        this.f13665s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f13666w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.A = new Path();
        this.C = false;
        this.h = view;
        this.f13663n = c6Var;
        this.f13667x = new org.telegram.ui.Components.y5(view, 0L, 120L, new LinearInterpolator());
        this.f13668y = new org.telegram.ui.Components.y5(view, 0L, 360L, er.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(lh.z7 z7Var) {
        if (z7Var == null || z7Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < z7Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) z7Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) z7Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, sy syVar) {
        View view;
        View k8Var;
        ArrayList arrayList2 = this.f13664r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.f13664r.size())) {
            return;
        }
        lh.w3 w3Var = this.f13660c;
        if (w3Var != null) {
            w3Var.e(true);
            this.f13660c = null;
        }
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            view = this.d;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt != view) {
                removeView(childAt);
                i10--;
            }
            i10++;
        }
        this.f13659b = null;
        this.f13668y.d(0.0f, true);
        invalidate();
        b(false);
        this.f13664r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.C = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    p8 p8Var = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, syVar);
                    if (storyItem != null) {
                        p8Var.c(storyItem.views, false);
                    }
                    h7.b6.a(p8Var);
                    k8Var = p8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    pc pcVar = new pc();
                    pcVar.f16550c = tL_mediaAreaWeather.emoji;
                    pcVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    zf.r0 r0Var = new zf.r0(getContext(), AndroidUtilities.density);
                    r0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    r0Var.setIsVideo(true);
                    r0Var.d(UserConfig.selectedAccount, pcVar.f16550c);
                    r0Var.setText(pcVar.a());
                    r0Var.e(3, tL_mediaAreaWeather.color);
                    k8Var = new l8(getContext(), r0Var, mediaArea);
                } else {
                    k8Var = new k8(getContext(), this.h, mediaArea);
                }
                k8Var.setOnClickListener(this);
                addView(k8Var);
                double d = mediaArea.coordinates.f22613w;
            }
        }
        view.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, sy syVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, syVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        float f10;
        float f11;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            k8 k8Var = this.f13659b;
            float fE = this.f13667x.e((k8Var == null || !k8Var.f13599s || k8Var.f13600w) ? false : true);
            k8 k8Var2 = this.f13659b;
            boolean z10 = k8Var2 != null && k8Var2.f13600w;
            float fE2 = this.f13668y.e(z10);
            RectF rectF2 = this.v;
            if (fE > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(fE, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.y5 y5Var = ((k8) childAt).f13592a;
                        k8 k8Var3 = this.f13659b;
                        float fE3 = y5Var.e(childAt == k8Var3 && k8Var3.f13599s);
                        if (fE3 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (fE3 * 255.0f);
                            Paint paint = this.f13666w;
                            paint.setAlpha(i11);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
            }
            if ((z10 || fE2 > f10) && this.f13658a != null) {
                if (this.B == null) {
                    this.B = ((f3) this).E.getPlayingBitmap();
                }
                if (this.B != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(fE2, 805306368));
                    canvas2.save();
                    Path path = this.A;
                    path.rewind();
                    rectF.set(this.f13658a.getX(), this.f13658a.getY(), this.f13658a.getX() + this.f13658a.getMeasuredWidth(), this.f13658a.getY() + this.f13658a.getMeasuredHeight());
                    k8 k8Var4 = this.f13658a;
                    float fLerp = AndroidUtilities.lerp(1.0f, (k8Var4.f13601x ? k8Var4.f13598r.a(0.05f) : 1.0f) * 1.05f, fE2);
                    canvas2.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f13658a.getRotation(), rectF.centerX(), rectF.centerY());
                    k8 k8Var5 = this.f13658a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = k8Var5.f13593b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * ((double) k8Var5.getMeasuredWidth())) : k8Var5.getMeasuredHeight() * f11;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f10, f10, getWidth(), getHeight());
                    int width = this.B.getWidth();
                    int height = this.B.getHeight();
                    Rect rect = this.f13665s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f13658a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.B, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f13658a.getX(), this.f13658a.getY());
                    canvas2.rotate(this.f13658a.getRotation(), this.f13658a.getPivotX(), this.f13658a.getPivotY());
                    canvas2.scale(this.f13658a.getScaleX() * fLerp, this.f13658a.getScaleY() * fLerp, this.f13658a.getPivotX(), this.f13658a.getPivotY());
                    this.f13658a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.B;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.B = null;
                }
            }
            invalidate();
        } else if (view instanceof k8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((k8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.C) {
            return;
        }
        this.C = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                y9 y9Var = k8Var.D;
                if (k8Var.v) {
                    AndroidUtilities.cancelRunOnUIThread(y9Var);
                    AndroidUtilities.runOnUIThread(y9Var, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        SpannableString spannableString;
        float f10;
        float f11;
        SpannableString spannableString2;
        float f12;
        int i10;
        float f13;
        boolean z11;
        int i11;
        k8 k8Var;
        float f14;
        float width;
        ArrayList arrayList;
        float f15;
        float f16;
        if (view instanceof k8) {
            if (view instanceof p8) {
                p8 p8Var = (p8) view;
                TL_stories.MediaArea mediaArea = p8Var.f13593b;
                e4 e4Var = ((f3) this).E;
                boolean z12 = e4Var.f13295y1;
                c4 c4Var = e4Var.K1;
                if (!z12 && c4Var.f13141a != null) {
                    ig.q0 q0VarD = ig.q0.d(mediaArea.reaction);
                    if (!q0VarD.equals(ig.q0.d(c4Var.f13141a.sent_reaction))) {
                        e4Var.L0(q0VarD);
                    }
                }
                p8Var.performHapticFeedback(3);
                p8Var.G.f11310a.startAnimation();
                sy syVar = e4Var.f13235g1;
                Random random = syVar.h;
                FrameLayout frameLayout = syVar.C;
                ArrayList arrayList2 = syVar.B;
                if (arrayList2.size() > 12) {
                    return;
                }
                ig.q0 q0VarD2 = ig.q0.d(mediaArea.reaction);
                String strFindAnimatedEmojiEmoticon = q0VarD2.f11412f;
                if (strFindAnimatedEmojiEmoticon == null) {
                    strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.k5.f(syVar.f42713b, q0VarD2.f11413g));
                }
                float measuredHeight = p8Var.getMeasuredHeight();
                float measuredWidth = p8Var.getMeasuredWidth();
                View view2 = (View) p8Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    width = 0.4f * view2.getWidth();
                    f14 = width;
                } else {
                    f14 = measuredHeight;
                    width = measuredWidth;
                }
                String strQ = sy.q(strFindAnimatedEmojiEmoticon);
                int iHashCode = p8Var.hashCode();
                boolean z13 = p8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (q0VarD2.f11412f != null) {
                    arrayList = arrayList2;
                    f15 = width;
                    f16 = f14;
                    if (syVar.d(strQ, iHashCode, null, null, -1, false, false, width, f14, z13)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ry ryVar = (ry) i0.a.i(1, arrayList);
                        ryVar.getClass();
                        ryVar.f42362e = f16;
                        ryVar.d = f15;
                        ryVar.f42359a = p8Var.getTranslationX() - (ryVar.d / 2.0f);
                        float translationY = p8Var.getTranslationY();
                        float f17 = ryVar.d;
                        ryVar.f42360b = translationY - (1.5f * f17);
                        if (ryVar.f42369m) {
                            ryVar.f42359a = ((-f17) * 1.8f) + ryVar.f42359a;
                            return;
                        } else {
                            ryVar.f42359a = ((-f17) * 0.2f) + ryVar.f42359a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f15 = width;
                    f16 = f14;
                }
                if (q0VarD2.f11413g == 0 || p8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i12 = 0;
                int i13 = 0;
                while (i12 < arrayList.size()) {
                    int i14 = i12;
                    if (((ry) arrayList.get(i12)).f42367k == q0VarD2.f11413g) {
                        i13++;
                    }
                    i12 = i14 + 1;
                }
                if (i13 >= 4) {
                    return;
                }
                ry ryVar2 = new ry();
                ryVar2.f42366j = ig.d.a(p8Var.getAnimatedEmojiDrawable(), true, true);
                if (!ryVar2.f42365i) {
                    ryVar2.f42363f = ((random.nextInt() % 101) / 100.0f) * (f15 / 4.0f);
                    ryVar2.f42364g = ((random.nextInt() % 101) / 100.0f) * (f16 / 4.0f);
                }
                ryVar2.f42372p = iHashCode;
                ryVar2.f42373q = null;
                ryVar2.f42367k = q0VarD2.f11413g;
                ryVar2.f42369m = z13;
                ryVar2.f42362e = f16;
                ryVar2.d = f15;
                ryVar2.f42359a = p8Var.getTranslationX() - (ryVar2.d / 2.0f);
                float translationY2 = p8Var.getTranslationY();
                float f18 = ryVar2.d;
                ryVar2.f42360b = translationY2 - (1.5f * f18);
                ryVar2.f42359a = ((-f18) * 1.8f) + ryVar2.f42359a;
                if (syVar.f42717n) {
                    ryVar2.f42366j.f(frameLayout);
                }
                arrayList.add(ryVar2);
                return;
            }
            if (this.f13659b == view) {
                AndroidUtilities.runOnUIThread(new y9(this, 25), 200L);
                TL_stories.MediaArea mediaArea2 = this.f13659b.f13593b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.f13659b.f13593b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.f13659b.f13593b).msg_id);
                    ((f3) this).D.H(new rn(bundle));
                    this.f13659b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    we.e.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.f13659b.f13593b).url);
                    this.f13659b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    we.e.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str);
                    this.f13659b = null;
                    invalidate();
                    return;
                }
                i8 i8Var = new i8(3, 0);
                i8Var.A = true;
                i8Var.I0 = this.f13659b.f13593b;
                i8Var.setResourceProvider(this.f13663n);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                TL_stories.MediaArea mediaArea3 = this.f13659b.f13593b;
                if (mediaArea3 instanceof TL_stories.TL_mediaAreaVenue) {
                    TL_stories.TL_mediaAreaVenue tL_mediaAreaVenue = (TL_stories.TL_mediaAreaVenue) mediaArea3;
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    tL_messageMediaVenue.venue_id = tL_mediaAreaVenue.venue_id;
                    tL_messageMediaVenue.venue_type = tL_mediaAreaVenue.venue_type;
                    tL_messageMediaVenue.title = tL_mediaAreaVenue.title;
                    tL_messageMediaVenue.address = tL_mediaAreaVenue.address;
                    tL_messageMediaVenue.provider = tL_mediaAreaVenue.provider;
                    tL_messageMediaVenue.geo = tL_mediaAreaVenue.geo;
                    tL_message.media = tL_messageMediaVenue;
                } else if (!(mediaArea3 instanceof TL_stories.TL_mediaAreaGeoPoint)) {
                    this.f13659b = null;
                    invalidate();
                    return;
                } else {
                    i8Var.J0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                i8Var.K0 = false;
                i8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((f3) this).D.H(i8Var);
                this.f13659b = null;
                invalidate();
                return;
            }
            k8 k8Var2 = (k8) view;
            this.f13658a = k8Var2;
            this.f13659b = k8Var2;
            invalidate();
            lh.w3 w3Var = this.f13660c;
            if (w3Var != null) {
                w3Var.e(true);
                this.f13660c = null;
            }
            lh.w3 w3Var2 = new lh.w3(getContext(), 0);
            Paint paint = new Paint(1);
            w3Var2.U = paint;
            paint.setPathEffect(new CornerPathEffect(w3Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new lh.v3(w3Var2, 0));
            w3Var2.T = zVar;
            zVar.setCallback(w3Var2);
            w3Var2.n(0.0f, this.f13659b.getTranslationX() - AndroidUtilities.dp(8.0f));
            w3Var2.d = 5000L;
            this.f13660c = w3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.f13659b.f13593b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else {
                if (!(mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift)) {
                    if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                        w3Var2.q(true);
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                        spannableStringBuilder.append((CharSequence) "\n");
                        TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.f13659b.f13593b;
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.f13660c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new j8(0), length, spannableStringBuilder.length(), 33);
                        w3Var2.l(11.0f, 7.0f, 11.0f, 7.0f);
                        z10 = true;
                    } else {
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
                    }
                    spannableString = new SpannableString(">");
                    cq cqVar = new cq(R.drawable.photos_arrow, 0);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 2.0f;
                    }
                    float fDp = AndroidUtilities.dp(f10);
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    cqVar.translate(fDp, AndroidUtilities.dp(f11));
                    spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
                    spannableString2 = new SpannableString("<");
                    cq cqVar2 = new cq(R.drawable.attach_arrow_right, 0);
                    if (z10) {
                        f12 = -1.0f;
                    } else {
                        f12 = -2.0f;
                    }
                    cqVar2.translate(AndroidUtilities.dp(f12), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
                    cqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(cqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    w3Var2.t(spannableStringBuilder);
                    w3Var2.f16984h0 = new p6(13, this, w3Var2);
                    if (z10) {
                        i10 = 100;
                    } else {
                        i10 = 50;
                    }
                    f13 = i10;
                    z11 = this.f13659b.getTranslationY() - ((float) AndroidUtilities.dp(f13)) < ((float) AndroidUtilities.dp(100.0f));
                    if (z11) {
                        i11 = 1;
                    } else {
                        i11 = 3;
                    }
                    w3Var2.f16972a = i11;
                    k8Var = this.f13659b;
                    if (!(k8Var.f13593b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (k8Var.getTranslationY() - (this.f13659b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f13) >= AndroidUtilities.dp(120.0f) : (this.f13659b.getMeasuredHeight() / 2.0f) + k8Var.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        w3Var2.setTranslationY(this.f13659b.getTranslationY() - (this.f13659b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        w3Var2.setTranslationY((this.f13659b.getMeasuredHeight() / 2.0f) + this.f13659b.getTranslationY());
                    } else {
                        w3Var2.setTranslationY((this.f13659b.getTranslationY() - (this.f13659b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f13));
                    }
                    w3Var2.setOnClickListener(new ag.w0(this, 24));
                    w3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(w3Var2, h7.z5.c(f13, -1));
                    w3Var2.v();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            }
            z10 = false;
            spannableString = new SpannableString(">");
            cq cqVar3 = new cq(R.drawable.photos_arrow, 0);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 2.0f;
            }
            float fDp2 = AndroidUtilities.dp(f10);
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            cqVar3.translate(fDp2, AndroidUtilities.dp(f11));
            spannableString.setSpan(cqVar3, 0, spannableString.length(), 33);
            spannableString2 = new SpannableString("<");
            cq cqVar4 = new cq(R.drawable.attach_arrow_right, 0);
            if (z10) {
                f12 = -1.0f;
            } else {
                f12 = -2.0f;
            }
            cqVar4.translate(AndroidUtilities.dp(f12), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
            cqVar4.setScale(-1.0f, 1.0f);
            spannableString2.setSpan(cqVar4, 0, spannableString2.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                spannableString = spannableString2;
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
            w3Var2.t(spannableStringBuilder);
            w3Var2.f16984h0 = new p6(13, this, w3Var2);
            if (z10) {
                i10 = 100;
            } else {
                i10 = 50;
            }
            f13 = i10;
            if (this.f13659b.getTranslationY() - ((float) AndroidUtilities.dp(f13)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            if (z11) {
                i11 = 1;
            } else {
                i11 = 3;
            }
            w3Var2.f16972a = i11;
            k8Var = this.f13659b;
            if (!(k8Var.f13593b instanceof TL_stories.TL_mediaAreaChannelPost)) {
                if (z11) {
                    w3Var2.setTranslationY((this.f13659b.getMeasuredHeight() / 2.0f) + this.f13659b.getTranslationY());
                } else {
                    w3Var2.setTranslationY((this.f13659b.getTranslationY() - (this.f13659b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f13));
                }
            } else if (z11) {
                w3Var2.setTranslationY((this.f13659b.getMeasuredHeight() / 2.0f) + this.f13659b.getTranslationY());
            } else {
                w3Var2.setTranslationY((this.f13659b.getTranslationY() - (this.f13659b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f13));
            }
            w3Var2.setOnClickListener(new ag.w0(this, 24));
            w3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(w3Var2, h7.z5.c(f13, -1));
            w3Var2.v();
            b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                TL_stories.MediaArea mediaArea = k8Var.f13593b;
                int measuredWidth = k8Var.getMeasuredWidth();
                int measuredHeight = k8Var.getMeasuredHeight();
                k8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                k8Var.setTranslationX((float) ((mediaArea.coordinates.f22614x / 100.0d) * ((double) getMeasuredWidth())));
                k8Var.setTranslationY((float) ((mediaArea.coordinates.f22615y / 100.0d) * ((double) getMeasuredHeight())));
                k8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) childAt;
                TL_stories.MediaArea mediaArea2 = l8Var.f13644a;
                int measuredWidth2 = l8Var.getMeasuredWidth();
                int measuredHeight2 = l8Var.getMeasuredHeight();
                l8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                l8Var.setTranslationX((float) ((mediaArea2.coordinates.f22614x / 100.0d) * ((double) getMeasuredWidth())));
                l8Var.setTranslationY((float) ((mediaArea2.coordinates.f22615y / 100.0d) * ((double) getMeasuredHeight())));
                l8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) getChildAt(i12);
                k8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f13593b.coordinates.f22613w / 100.0d) * ((double) size)), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f13593b.coordinates.h / 100.0d) * ((double) size2)), 1073741824));
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) getChildAt(i12);
                l8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f13644a.coordinates.f22613w / 100.0d) * ((double) size)), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f13644a.coordinates.h / 100.0d) * ((double) size2)), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        lh.w3 w3Var;
        if (getChildCount() == 0 || (w3Var = this.f13660c) == null || !w3Var.R) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            lh.w3 w3Var2 = this.f13660c;
            if (w3Var2 != null) {
                w3Var2.e(true);
                this.f13660c = null;
            }
            this.f13659b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
