package lh;

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
public final class l5 extends FrameLayout {
    public final f5 A;
    public final ArrayList B;
    public final ArrayList C;
    public final o4 D;
    public float E;
    public final i5 f15882a;
    public float f15883b;
    public float f15884c;
    public float d;
    public final j5 f15885e;
    public float f15886f;
    public final e5 h;
    public float f15887n;
    public final i9 f15888r;
    public final Drawable f15889s;
    public float v;
    public boolean f15890w;
    public int f15891x;
    public long f15892y;

    public l5(Context context, i9 i9Var) {
        super(context);
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new o4();
        b bVar = i9Var.f15793y;
        this.f15888r = i9Var;
        e5 e5Var = new e5(getContext(), this, i9Var);
        this.h = e5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f15889s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, bVar), PorterDuff.Mode.MULTIPLY));
        j5 j5Var = new j5(this, context);
        this.f15885e = j5Var;
        f5 f5Var = new f5(this, context);
        this.A = f5Var;
        f5Var.b(new g5(0, this));
        i5 i5Var = new i5(context, this, i9Var);
        this.f15882a = i5Var;
        f5Var.setAdapter(i5Var);
        j5Var.addView(f5Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(e5Var, i7.f6.c(-1.0f, -1));
        addView(j5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f9 = this.d;
        c5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f9;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.B;
        arrayList2.clear();
        this.f15892y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f15830a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f15888r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f15831b = (r6) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        e5 e5Var = this.h;
        ArrayList arrayList3 = e5Var.C;
        ArrayList arrayList4 = e5Var.A;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        e5Var.d();
        if (e5Var.getMeasuredHeight() > 0) {
            e5Var.c(i10, false, false);
        } else {
            e5Var.f15723w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((h4) arrayList3.get(i13)).a(((h4) arrayList3.get(i13)).f15659b);
        }
        f5 f5Var = this.A;
        f5Var.setAdapter(null);
        i5 i5Var = this.f15882a;
        f5Var.setAdapter(i5Var);
        i5Var.g();
        f5Var.setCurrentItem(i10);
    }

    public h4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public c5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                if (((Integer) ((c5) arrayList.get(i10)).getTag()).intValue() == this.A.getCurrentItem()) {
                    return (c5) arrayList.get(i10);
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
            ArrayList arrayList = this.B;
            if (closestPosition < arrayList.size()) {
                return ((k5) arrayList.get(closestPosition)).f15830a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f15888r.f15745b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        e5 e5Var = this.h;
        ((FrameLayout.LayoutParams) e5Var.getLayoutParams()).topMargin = i12;
        this.f15887n = e5Var.getFinalHeight();
        this.f15883b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.f15885e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f15887n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f15884c = size - dp;
        while (true) {
            ArrayList arrayList = this.C;
            if (i13 < arrayList.size()) {
                ((c5) arrayList.get(i13)).setListBottomPadding(this.d);
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
        c5 currentPage;
        float f9;
        if (this.f15891x >= AndroidUtilities.dp(20.0f)) {
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
            float f10 = this.E;
            if (z11) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            ofFloat.addUpdateListener(new d5(this, 0));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f15891x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f15438r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f15434c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.n((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.q1.f23735w);
            }
        }
    }

    public void setOffset(float f9) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f9) {
            this.v = f9;
            this.f15885e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f10 = this.f15886f;
            float clamp = Utilities.clamp(f9 / this.f15884c, 1.0f, 0.0f);
            this.f15886f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            i9 i9Var = this.f15888r;
            d4 t10 = i9Var.t();
            f9 f9Var = i9Var.f15774o0;
            e5 e5Var = this.h;
            if (f10 == 1.0f && this.f15886f != 1.0f) {
                if (i9Var.K0 != null) {
                    MessageObject messageObject = (MessageObject) i9Var.K0.f15838i.get(Utilities.clamp(e5Var.getClosestPosition(), i9Var.K0.f15838i.size() - 1, 0));
                    long b10 = k6.b(messageObject);
                    ImageReceiver imageReceiver = f9Var.f15603c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        f9Var.f15603c = null;
                    }
                    y8 y8Var = i9Var.f15765j0;
                    int i12 = messageObject.storyItem.f22629id;
                    i9 i9Var2 = y8Var.J0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= y8Var.f16179t0.size()) {
                            break;
                        } else if (b10 == k6.b(i9Var2.K0.f(((Integer) ((ArrayList) y8Var.f16179t0.get(i13)).get(0)).intValue()))) {
                            if (i9Var2.N0) {
                                i11 = (y8Var.f16179t0.size() - 1) - i13;
                            } else {
                                i11 = i13;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < ((ArrayList) y8Var.f16179t0.get(i13)).size()) {
                                    if (((Integer) ((ArrayList) y8Var.f16179t0.get(i13)).get(i14)).intValue() == i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = 0;
                                    break;
                                }
                            }
                            if (y8Var.getCurrentPeerView() != null && y8Var.getCurrentItem() == i11) {
                                d4 currentPeerView = y8Var.getCurrentPeerView();
                                if (currentPeerView.F1 != i14) {
                                    currentPeerView.F1 = i14;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                y8Var.x(i11, false);
                                d4 currentPeerView2 = y8Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    q7 q7Var = (q7) currentPeerView2.getParent();
                                    q7Var.a(true);
                                    if (y8Var.f16179t0 != null) {
                                        d4 d4Var = q7Var.f16132a;
                                        long j10 = q7Var.f16133b;
                                        ArrayList arrayList = q7Var.f16134c;
                                        d4Var.f15540x1 = j10;
                                        d4Var.f15532v1 = arrayList;
                                        d4Var.o0(i14);
                                    } else {
                                        q7Var.f16132a.U0(i14, q7Var.f16133b);
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                } else if (t10 != null && t10.F1 != (closestPosition = e5Var.getClosestPosition())) {
                    t10.F1 = closestPosition;
                    t10.f1(false);
                }
                e5Var.d.abortAnimation();
                ValueAnimator valueAnimator = e5Var.I;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    e5Var.I = null;
                }
                e5Var.c(e5Var.G, false, true);
            }
            if (t10 != null) {
                h3 h3Var = t10.Y0;
                e5Var.f15715a = h3Var.getTop();
                e5Var.f15716b = h3Var.getMeasuredWidth();
                e5Var.f15717c = h3Var.getMeasuredHeight();
            }
            e5Var.setProgressToOpen(this.f15886f);
            f5 f5Var = this.A;
            if (f5Var.f15595s0 && this.f15886f != 1.0f) {
                f5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f15886f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f15886f != 1.0f) {
                f5Var.f15595s0 = false;
            }
        }
    }
}
