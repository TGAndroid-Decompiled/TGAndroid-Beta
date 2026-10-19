package ci;

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
public final class c6 extends FrameLayout {
    public final w5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final f5 H;
    public float I;
    public final z5 f5279a;
    public float f5280b;
    public float f5281c;
    public float d;
    public final a6 e;
    public float f5282f;
    public final v5 h;
    public float f5283n;
    public final aa f5284r;
    public final Drawable f5285s;
    public float v;
    public boolean f5286w;
    public int f5287x;
    public long f5288y;

    public c6(Context context, aa aaVar) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new f5();
        b bVar = aaVar.f5230y;
        this.f5284r = aaVar;
        v5 v5Var = new v5(getContext(), this, aaVar);
        this.h = v5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f5285s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21060h5, bVar), PorterDuff.Mode.MULTIPLY));
        a6 a6Var = new a6(this, context);
        this.e = a6Var;
        w5 w5Var = new w5(this, context);
        this.E = w5Var;
        w5Var.b(new x5(this, 0));
        z5 z5Var = new z5(context, this, aaVar);
        this.f5279a = z5Var;
        w5Var.setAdapter(z5Var);
        a6Var.addView(w5Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(v5Var, w7.z5.c(-1.0f, -1));
        addView(a6Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        u5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f5288y = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f5251a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f5284r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f5252b = (h7) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        v5 v5Var = this.h;
        ArrayList arrayList3 = v5Var.G;
        ArrayList arrayList4 = v5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        v5Var.d();
        if (v5Var.getMeasuredHeight() > 0) {
            v5Var.c(i10, false, false);
        } else {
            v5Var.f6165w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((w4) arrayList3.get(i13)).a(((w4) arrayList3.get(i13)).f6114b);
        }
        w5 w5Var = this.E;
        w5Var.setAdapter(null);
        z5 z5Var = this.f5279a;
        w5Var.setAdapter(z5Var);
        z5Var.g();
        w5Var.setCurrentItem(i10);
    }

    public w4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public u5 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((u5) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (u5) arrayList.get(i10);
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
                return ((b6) arrayList.get(closestPosition)).f5251a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f5284r.f5179b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        v5 v5Var = this.h;
        ((FrameLayout.LayoutParams) v5Var.getLayoutParams()).topMargin = i12;
        this.f5283n = v5Var.getFinalHeight();
        this.f5280b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f5283n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f5281c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((u5) arrayList.get(i13)).setListBottomPadding(this.d);
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
        u5 currentPage;
        float f7;
        if (this.f5287x >= AndroidUtilities.dp(20.0f)) {
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
            ofFloat.addUpdateListener(new ah.c0(this, 19));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f5287x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f6053r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f6050c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.A((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.o1.f21631w);
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
            float f10 = this.f5282f;
            float clamp = Utilities.clamp(f7 / this.f5281c, 1.0f, 0.0f);
            this.f5282f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            aa aaVar = this.f5284r;
            q4 t10 = aaVar.t();
            x9 x9Var = aaVar.f5217s0;
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            v5 v5Var = this.h;
            if (i12 == 0 && this.f5282f != 1.0f) {
                if (aaVar.O0 != null) {
                    MessageObject messageObject = (MessageObject) aaVar.O0.f5151i.get(Utilities.clamp(v5Var.getClosestPosition(), aaVar.O0.f5151i.size() - 1, 0));
                    long b10 = a7.b(messageObject);
                    ImageReceiver imageReceiver = x9Var.f6176c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        x9Var.f6176c = null;
                    }
                    q9 q9Var = aaVar.f5205n0;
                    int i13 = messageObject.storyItem.f20509id;
                    aa aaVar2 = q9Var.N0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= q9Var.f5516x0.size()) {
                            break;
                        } else if (b10 == a7.b(aaVar2.O0.f(((Integer) ((ArrayList) q9Var.f5516x0.get(i14)).get(0)).intValue()))) {
                            if (aaVar2.R0) {
                                i11 = (q9Var.f5516x0.size() - 1) - i14;
                            } else {
                                i11 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) q9Var.f5516x0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) q9Var.f5516x0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (q9Var.getCurrentPeerView() != null && q9Var.getCurrentItem() == i11) {
                                q4 currentPeerView = q9Var.getCurrentPeerView();
                                if (currentPeerView.J1 != i15) {
                                    currentPeerView.J1 = i15;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                q9Var.x(i11, false);
                                q4 currentPeerView2 = q9Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    h8 h8Var = (h8) currentPeerView2.getParent();
                                    h8Var.a(true);
                                    if (q9Var.f5516x0 != null) {
                                        q4 q4Var = h8Var.f5478a;
                                        long j10 = h8Var.f5479b;
                                        ArrayList arrayList = h8Var.f5480c;
                                        q4Var.B1 = j10;
                                        q4Var.f5844z1 = arrayList;
                                        q4Var.o0(i15);
                                    } else {
                                        h8Var.f5478a.U0(i15, h8Var.f5479b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = v5Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.f1(false);
                }
                v5Var.d.abortAnimation();
                ValueAnimator valueAnimator = v5Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    v5Var.M = null;
                }
                v5Var.c(v5Var.K, false, true);
            }
            if (t10 != null) {
                r3 r3Var = t10.f5771c1;
                v5Var.f6158a = r3Var.getTop();
                v5Var.f6159b = r3Var.getMeasuredWidth();
                v5Var.f6160c = r3Var.getMeasuredHeight();
            }
            v5Var.setProgressToOpen(this.f5282f);
            w5 w5Var = this.E;
            if (w5Var.f6117w0 && this.f5282f != 1.0f) {
                w5Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f5282f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f5282f != 1.0f) {
                w5Var.f6117w0 = false;
            }
        }
    }
}
