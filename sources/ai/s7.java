package ai;

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
public final class s7 extends FrameLayout {
    public final m7 E;
    public final ArrayList F;
    public final ArrayList G;
    public final u6 H;
    public float I;
    public final p7 f1503a;
    public float f1504b;
    public float f1505c;
    public float d;
    public final q7 e;
    public float f1506f;
    public final l7 h;
    public float f1507n;
    public final jc f1508r;
    public final Drawable f1509s;
    public float v;
    public boolean f1510w;
    public int f1511x;
    public long f1512y;

    public s7(jc jcVar, Context context) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new u6();
        d dVar = jcVar.f1114y;
        this.f1508r = jcVar;
        l7 l7Var = new l7(this, jcVar, getContext());
        this.h = l7Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f1509s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19146h5, dVar), PorterDuff.Mode.MULTIPLY));
        q7 q7Var = new q7(this, context);
        this.e = q7Var;
        m7 m7Var = new m7(this, context);
        this.E = m7Var;
        m7Var.b(new n7(this, 0));
        p7 p7Var = new p7(this, jcVar, context);
        this.f1503a = p7Var;
        m7Var.setAdapter(p7Var);
        q7Var.addView(m7Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(l7Var, w7.y5.c(-1.0f, -1));
        addView(q7Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        k7 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f1512y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f1473a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f1508r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f1474b = (k9) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        l7 l7Var = this.h;
        ArrayList arrayList3 = l7Var.G;
        ArrayList arrayList4 = l7Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        l7Var.d();
        if (l7Var.getMeasuredHeight() > 0) {
            l7Var.c(i10, false, false);
        } else {
            l7Var.f1258w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((l6) arrayList3.get(i13)).a(((l6) arrayList3.get(i13)).f1187b);
        }
        m7 m7Var = this.E;
        m7Var.setAdapter(null);
        p7 p7Var = this.f1503a;
        m7Var.setAdapter(p7Var);
        p7Var.g();
        m7Var.setCurrentItem(i10);
    }

    public l6 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public k7 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((k7) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (k7) arrayList.get(i10);
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
                return ((r7) arrayList.get(closestPosition)).f1473a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f1508r.f1063b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        l7 l7Var = this.h;
        ((FrameLayout.LayoutParams) l7Var.getLayoutParams()).topMargin = i12;
        this.f1507n = l7Var.getFinalHeight();
        this.f1504b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f1507n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f1505c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((k7) arrayList.get(i13)).setListBottomPadding(this.d);
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
        k7 currentPage;
        float f7;
        if (this.f1511x >= AndroidUtilities.dp(20.0f)) {
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
            ofFloat.addUpdateListener(new a(this, 11));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f19685w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f1511x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f1135r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f1132c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.w((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.o1.f19685w);
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
            float f10 = this.f1506f;
            float clamp = Utilities.clamp(f7 / this.f1505c, 1.0f, 0.0f);
            this.f1506f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            jc jcVar = this.f1508r;
            e6 t10 = jcVar.t();
            gc gcVar = jcVar.f1101s0;
            l7 l7Var = this.h;
            if (f10 == 1.0f && this.f1506f != 1.0f) {
                if (jcVar.O0 != null) {
                    MessageObject messageObject = (MessageObject) jcVar.O0.f725i.get(Utilities.clamp(l7Var.getClosestPosition(), jcVar.O0.f725i.size() - 1, 0));
                    long b10 = d9.b(messageObject);
                    ImageReceiver imageReceiver = gcVar.f917c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        gcVar.f917c = null;
                    }
                    zb zbVar = jcVar.f1089n0;
                    int i12 = messageObject.storyItem.f18587id;
                    jc jcVar2 = zbVar.N0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= zbVar.f1311x0.size()) {
                            break;
                        } else if (b10 == d9.b(jcVar2.O0.f(((Integer) ((ArrayList) zbVar.f1311x0.get(i13)).get(0)).intValue()))) {
                            if (jcVar2.R0) {
                                i11 = (zbVar.f1311x0.size() - 1) - i13;
                            } else {
                                i11 = i13;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < ((ArrayList) zbVar.f1311x0.get(i13)).size()) {
                                    if (((Integer) ((ArrayList) zbVar.f1311x0.get(i13)).get(i14)).intValue() == i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = 0;
                                    break;
                                }
                            }
                            if (zbVar.getCurrentPeerView() != null && zbVar.getCurrentItem() == i11) {
                                e6 currentPeerView = zbVar.getCurrentPeerView();
                                if (currentPeerView.J1 != i14) {
                                    currentPeerView.J1 = i14;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                zbVar.x(i11, false);
                                e6 currentPeerView2 = zbVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    ma maVar = (ma) currentPeerView2.getParent();
                                    maVar.a(true);
                                    if (zbVar.f1311x0 != null) {
                                        e6 e6Var = maVar.f1270a;
                                        long j3 = maVar.f1271b;
                                        ArrayList arrayList = maVar.f1272c;
                                        e6Var.B1 = j3;
                                        e6Var.f848z1 = arrayList;
                                        e6Var.o0(i14);
                                    } else {
                                        maVar.f1270a.U0(i14, maVar.f1271b);
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = l7Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.f1(false);
                }
                l7Var.d.abortAnimation();
                ValueAnimator valueAnimator = l7Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    l7Var.M = null;
                }
                l7Var.c(l7Var.K, false, true);
            }
            if (t10 != null) {
                a5 a5Var = t10.f776c1;
                l7Var.f1251a = a5Var.getTop();
                l7Var.f1252b = a5Var.getMeasuredWidth();
                l7Var.f1253c = a5Var.getMeasuredHeight();
            }
            l7Var.setProgressToOpen(this.f1506f);
            m7 m7Var = this.E;
            if (m7Var.f1261w0 && this.f1506f != 1.0f) {
                m7Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f1506f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f1506f != 1.0f) {
                m7Var.f1261w0 = false;
            }
        }
    }
}
