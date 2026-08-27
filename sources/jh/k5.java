package jh;

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

public final class k5 extends FrameLayout {
    public final e5 A;
    public final ArrayList B;
    public final ArrayList C;
    public final o4 D;
    public float E;

    public final h5 f13577a;

    public float f13578b;

    public float f13579c;
    public float d;

    public final i5 f13580e;

    public float f13581f;
    public final d5 h;

    public float f13582n;

    public final i9 f13583r;

    public final Drawable f13584s;
    public float v;

    public boolean f13585w;

    public int f13586x;

    public long f13587y;

    public k5(Context context, i9 i9Var) {
        super(context);
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new o4();
        b bVar = i9Var.f13515y;
        this.f13583r = i9Var;
        d5 d5Var = new d5(getContext(), this, i9Var);
        this.h = d5Var;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f13584s = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, bVar), PorterDuff.Mode.MULTIPLY));
        i5 i5Var = new i5(this, context);
        this.f13580e = i5Var;
        e5 e5Var = new e5(this, context);
        this.A = e5Var;
        e5Var.b(new f5(0, this));
        h5 h5Var = new h5(context, this, i9Var);
        this.f13577a = h5Var;
        e5Var.setAdapter(h5Var);
        i5Var.addView(e5Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(d5Var, h7.z5.c(-1.0f, -1));
        addView(i5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        c5 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f10;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.B;
        arrayList2.clear();
        this.f13587y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            j5 j5Var = new j5();
            j5Var.f13532a = storyItem;
            arrayList2.add(j5Var);
        }
        ArrayList arrayListE = MessagesController.getInstance(this.f13583r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (arrayListE != null) {
            for (int i12 = 0; i12 < arrayListE.size(); i12++) {
                r6 r6Var = (r6) arrayListE.get(i12);
                j5 j5Var2 = new j5();
                j5Var2.f13533b = r6Var;
                arrayList2.add(j5Var2);
            }
        }
        d5 d5Var = this.h;
        ArrayList arrayList3 = d5Var.C;
        ArrayList arrayList4 = d5Var.A;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        d5Var.d();
        if (d5Var.getMeasuredHeight() > 0) {
            d5Var.c(i10, false, false);
        } else {
            d5Var.f13445w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((h4) arrayList3.get(i13)).a(((h4) arrayList3.get(i13)).f13382b);
        }
        e5 e5Var = this.A;
        e5Var.setAdapter(null);
        h5 h5Var = this.f13577a;
        e5Var.setAdapter(h5Var);
        h5Var.g();
        e5Var.setCurrentItem(i10);
    }

    public h4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public c5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((c5) arrayList.get(i10)).getTag()).intValue() == this.A.getCurrentItem()) {
                return (c5) arrayList.get(i10);
            }
            i10++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.B;
        if (closestPosition >= arrayList.size()) {
            return null;
        }
        return ((j5) arrayList.get(closestPosition)).f13532a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.f13583r.f13467b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        d5 d5Var = this.h;
        ((FrameLayout.LayoutParams) d5Var.getLayoutParams()).topMargin = i13;
        this.f13582n = d5Var.getFinalHeight();
        this.f13578b = AndroidUtilities.dp(20.0f) + i13;
        ((FrameLayout.LayoutParams) this.f13580e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float fDp = (((AndroidUtilities.dp(20.0f) + i13) + this.f13582n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = fDp;
        this.f13579c = size - fDp;
        while (true) {
            ArrayList arrayList = this.C;
            if (i12 >= arrayList.size()) {
                super.onMeasure(i10, i11);
                return;
            } else {
                ((c5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        c5 currentPage;
        boolean z10 = this.f13586x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.E, z11 ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 24));
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.start();
        }
        this.f13586x = i10;
        if (i10 <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.f13156r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        FrameLayout frameLayout = currentPage.f13152c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.l((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.p1.f23706w);
        }
    }

    public void setOffset(float f10) {
        int closestPosition;
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        this.f13580e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
        float f11 = this.f13581f;
        float fClamp = Utilities.clamp(f10 / this.f13579c, 1.0f, 0.0f);
        this.f13581f = fClamp;
        Utilities.clamp(fClamp / 0.5f, 1.0f, 0.0f);
        i9 i9Var = this.f13583r;
        e4 e4VarT = i9Var.t();
        f9 f9Var = i9Var.f13496o0;
        d5 d5Var = this.h;
        if (f11 == 1.0f && this.f13581f != 1.0f) {
            if (i9Var.K0 != null) {
                MessageObject messageObject = (MessageObject) i9Var.K0.f13540i.get(Utilities.clamp(d5Var.getClosestPosition(), i9Var.K0.f13540i.size() - 1, 0));
                long jB = j6.b(messageObject);
                ImageReceiver imageReceiver = f9Var.f13335c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.f13335c = null;
                }
                y8 y8Var = i9Var.f13487j0;
                int i10 = messageObject.storyItem.f22617id;
                i9 i9Var2 = y8Var.J0;
                for (int i11 = 0; i11 < y8Var.f13864t0.size(); i11++) {
                    if (jB == j6.b(i9Var2.K0.f(((Integer) ((ArrayList) y8Var.f13864t0.get(i11)).get(0)).intValue()))) {
                        int size = i9Var2.N0 ? (y8Var.f13864t0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) y8Var.f13864t0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) y8Var.f13864t0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (y8Var.getCurrentPeerView() != null && y8Var.getCurrentItem() == size) {
                            e4 currentPeerView = y8Var.getCurrentPeerView();
                            if (currentPeerView.F1 == i12) {
                                break;
                            }
                            currentPeerView.F1 = i12;
                            currentPeerView.f1(false);
                            break;
                        }
                        y8Var.x(size, false);
                        e4 currentPeerView2 = y8Var.getCurrentPeerView();
                        if (currentPeerView2 == null) {
                            break;
                        }
                        p7 p7Var = (p7) currentPeerView2.getParent();
                        p7Var.a(true);
                        if (y8Var.f13864t0 == null) {
                            p7Var.f13828a.U0(i12, p7Var.f13829b);
                            break;
                        }
                        e4 e4Var = p7Var.f13828a;
                        long j10 = p7Var.f13829b;
                        ArrayList arrayList = p7Var.f13830c;
                        e4Var.f13291x1 = j10;
                        e4Var.f13283v1 = arrayList;
                        e4Var.o0(i12);
                        break;
                    }
                }
            } else if (e4VarT != null && e4VarT.F1 != (closestPosition = d5Var.getClosestPosition())) {
                e4VarT.F1 = closestPosition;
                e4VarT.f1(false);
            }
            d5Var.d.abortAnimation();
            ValueAnimator valueAnimator = d5Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                d5Var.I = null;
            }
            d5Var.c(d5Var.G, false, true);
        }
        if (e4VarT != null) {
            j3 j3Var = e4VarT.Y0;
            d5Var.f13437a = j3Var.getTop();
            d5Var.f13438b = j3Var.getMeasuredWidth();
            d5Var.f13439c = j3Var.getMeasuredHeight();
        }
        d5Var.setProgressToOpen(this.f13581f);
        e5 e5Var = this.A;
        if (e5Var.f13302s0 && this.f13581f != 1.0f) {
            e5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f13581f == 0.0f ? 4 : 0);
        if (this.f13581f != 1.0f) {
            e5Var.f13302s0 = false;
        }
    }
}
