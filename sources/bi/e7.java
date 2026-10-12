package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class e7 extends FrameLayout {
    public final y6 E;
    public final ArrayList F;
    public final ArrayList G;
    public final g6 H;
    public float I;
    public final b7 f2988a;
    public float f2989b;
    public float f2990c;
    public float d;
    public final c7 e;
    public float f2991f;
    public final x6 h;
    public float f2992n;
    public final sb f2993r;
    public final Drawable f2994s;
    public float v;
    public boolean f2995w;
    public int f2996x;
    public long f2997y;

    public e7(Context context, sb sbVar) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new g6();
        b bVar = sbVar.f3714y;
        this.f2993r = sbVar;
        x6 x6Var = new x6(getContext(), this, sbVar);
        this.h = x6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f2994s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, bVar), PorterDuff.Mode.MULTIPLY));
        c7 c7Var = new c7(this, context);
        this.e = c7Var;
        y6 y6Var = new y6(this, context);
        this.E = y6Var;
        y6Var.b(new z6(this, 0));
        b7 b7Var = new b7(context, this, sbVar);
        this.f2988a = b7Var;
        y6Var.setAdapter(b7Var);
        c7Var.addView(y6Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        addView(x6Var, w7.a6.d(-1.0f, -1));
        addView(c7Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        w6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f2997y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f2953a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f2993r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f2954b = (w8) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        x6 x6Var = this.h;
        ArrayList arrayList3 = x6Var.G;
        ArrayList arrayList4 = x6Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        x6Var.d();
        if (x6Var.getMeasuredHeight() > 0) {
            x6Var.c(i10, false, false);
        } else {
            x6Var.f4017w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((x5) arrayList3.get(i13)).a(((x5) arrayList3.get(i13)).f3955b);
        }
        y6 y6Var = this.E;
        y6Var.setAdapter(null);
        b7 b7Var = this.f2988a;
        y6Var.setAdapter(b7Var);
        b7Var.g();
        y6Var.setCurrentItem(i10);
    }

    public x5 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public w6 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((w6) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (w6) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition >= 0) {
            ArrayList arrayList = this.F;
            if (closestPosition < arrayList.size()) {
                return ((d7) arrayList.get(closestPosition)).f2953a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f2993r.f3663b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        x6 x6Var = this.h;
        ((FrameLayout.LayoutParams) x6Var.getLayoutParams()).topMargin = i12;
        this.f2992n = x6Var.getFinalHeight();
        this.f2989b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f2992n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f2990c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((w6) arrayList.get(i13)).setListBottomPadding(this.d);
                i13++;
            } else {
                super.onMeasure(i10, i11);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        boolean z11;
        w6 currentPage;
        float f7;
        if (this.f2996x >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            float f10 = this.I;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            ofFloat.addUpdateListener(new ah.c0(this, 12));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20554w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f2996x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f3905r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f3902c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.A((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.o1.f20554w);
            }
        }
    }

    public void setOffset(float f7) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f7) {
            this.v = f7;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f10 = this.f2991f;
            float clamp = Utilities.clamp(f7 / this.f2990c, 1.0f, 0.0f);
            this.f2991f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            sb sbVar = this.f2993r;
            q5 t10 = sbVar.t();
            pb pbVar = sbVar.f3701s0;
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            x6 x6Var = this.h;
            if (i12 == 0 && this.f2991f != 1.0f) {
                if (sbVar.O0 != null) {
                    MessageObject messageObject = (MessageObject) sbVar.O0.f3429i.get(Utilities.clamp(x6Var.getClosestPosition(), sbVar.O0.f3429i.size() - 1, 0));
                    long b10 = o8.b(messageObject);
                    ImageReceiver imageReceiver = pbVar.f3482c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        pbVar.f3482c = null;
                    }
                    ib ibVar = sbVar.f3689n0;
                    int i13 = messageObject.storyItem.f19451id;
                    sb sbVar2 = ibVar.N0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= ibVar.f3985x0.size()) {
                            break;
                        } else if (b10 == o8.b(sbVar2.O0.f(((Integer) ((ArrayList) ibVar.f3985x0.get(i14)).get(0)).intValue()))) {
                            if (sbVar2.R0) {
                                i11 = (ibVar.f3985x0.size() - 1) - i14;
                            } else {
                                i11 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) ibVar.f3985x0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) ibVar.f3985x0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (ibVar.getCurrentPeerView() != null && ibVar.getCurrentItem() == i11) {
                                q5 currentPeerView = ibVar.getCurrentPeerView();
                                if (currentPeerView.J1 != i15) {
                                    currentPeerView.J1 = i15;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                ibVar.x(i11, false);
                                q5 currentPeerView2 = ibVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    w9 w9Var = (w9) currentPeerView2.getParent();
                                    w9Var.a(true);
                                    if (ibVar.f3985x0 != null) {
                                        q5 q5Var = w9Var.f3923a;
                                        long j10 = w9Var.f3924b;
                                        ArrayList arrayList = w9Var.f3925c;
                                        q5Var.B1 = j10;
                                        q5Var.f3584z1 = arrayList;
                                        q5Var.o0(i15);
                                    } else {
                                        w9Var.f3923a.U0(i15, w9Var.f3924b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = x6Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.f1(false);
                }
                x6Var.d.abortAnimation();
                ValueAnimator valueAnimator = x6Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    x6Var.M = null;
                }
                x6Var.c(x6Var.K, false, true);
            }
            if (t10 != null) {
                o4 o4Var = t10.f3511c1;
                x6Var.f4010a = o4Var.getTop();
                x6Var.f4011b = o4Var.getMeasuredWidth();
                x6Var.f4012c = o4Var.getMeasuredHeight();
            }
            x6Var.setProgressToOpen(this.f2991f);
            y6 y6Var = this.E;
            if (y6Var.f4020w0 && this.f2991f != 1.0f) {
                y6Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f2991f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f2991f != 1.0f) {
                y6Var.f4020w0 = false;
            }
        }
    }
}
