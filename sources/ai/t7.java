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
public final class t7 extends FrameLayout {
    public final n7 E;
    public final ArrayList F;
    public final ArrayList G;
    public final v6 H;
    public float I;
    public final q7 f1738a;
    public float f1739b;
    public float f1740c;
    public float d;
    public final r7 f1741e;
    public float f1742f;
    public final m7 h;
    public float f1743n;
    public final kc f1744r;
    public final Drawable f1745s;
    public float v;
    public boolean f1746w;
    public int f1747x;
    public long f1748y;

    public t7(kc kcVar, Context context) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new v6();
        d dVar = kcVar.f1308y;
        this.f1744r = kcVar;
        m7 m7Var = new m7(this, kcVar, getContext());
        this.h = m7Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f1745s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20893h5, dVar), PorterDuff.Mode.MULTIPLY));
        r7 r7Var = new r7(this, context);
        this.f1741e = r7Var;
        n7 n7Var = new n7(this, context);
        this.E = n7Var;
        n7Var.b(new o7(this, 0));
        q7 q7Var = new q7(this, kcVar, context);
        this.f1738a = q7Var;
        n7Var.setAdapter(q7Var);
        r7Var.addView(n7Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        addView(m7Var, w7.x5.d(-1.0f, -1));
        addView(r7Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        l7 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f1748y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f1708a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f1744r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f1709b = (l9) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        m7 m7Var = this.h;
        ArrayList arrayList3 = m7Var.G;
        ArrayList arrayList4 = m7Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        m7Var.d();
        if (m7Var.getMeasuredHeight() > 0) {
            m7Var.c(i10, false, false);
        } else {
            m7Var.f1474w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((m6) arrayList3.get(i13)).a(((m6) arrayList3.get(i13)).f1397b);
        }
        n7 n7Var = this.E;
        n7Var.setAdapter(null);
        q7 q7Var = this.f1738a;
        n7Var.setAdapter(q7Var);
        q7Var.g();
        n7Var.setCurrentItem(i10);
    }

    public m6 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public l7 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((l7) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (l7) arrayList.get(i10);
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
                return ((s7) arrayList.get(closestPosition)).f1708a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f1744r.f1256b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        m7 m7Var = this.h;
        ((FrameLayout.LayoutParams) m7Var.getLayoutParams()).topMargin = i12;
        this.f1743n = m7Var.getFinalHeight();
        this.f1739b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.f1741e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f1743n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f1740c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((l7) arrayList.get(i13)).setListBottomPadding(this.d);
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
        l7 currentPage;
        float f7;
        if (this.f1747x >= AndroidUtilities.dp(20.0f)) {
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
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21443w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f1747x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f1340r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f1336c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.y((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.o1.f21443w);
            }
        }
    }

    public void setOffset(float f7) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f7) {
            this.v = f7;
            this.f1741e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f10 = this.f1742f;
            float clamp = Utilities.clamp(f7 / this.f1740c, 1.0f, 0.0f);
            this.f1742f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            kc kcVar = this.f1744r;
            f6 t10 = kcVar.t();
            hc hcVar = kcVar.f1295s0;
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            m7 m7Var = this.h;
            if (i12 == 0 && this.f1742f != 1.0f) {
                if (kcVar.O0 != null) {
                    MessageObject messageObject = (MessageObject) kcVar.O0.f899i.get(Utilities.clamp(m7Var.getClosestPosition(), kcVar.O0.f899i.size() - 1, 0));
                    long b10 = e9.b(messageObject);
                    ImageReceiver imageReceiver = hcVar.f1107c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        hcVar.f1107c = null;
                    }
                    ac acVar = kcVar.f1283n0;
                    int i13 = messageObject.storyItem.f20305id;
                    kc kcVar2 = acVar.N0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= acVar.f1542x0.size()) {
                            break;
                        } else if (b10 == e9.b(kcVar2.O0.f(((Integer) ((ArrayList) acVar.f1542x0.get(i14)).get(0)).intValue()))) {
                            if (kcVar2.R0) {
                                i11 = (acVar.f1542x0.size() - 1) - i14;
                            } else {
                                i11 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) acVar.f1542x0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) acVar.f1542x0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (acVar.getCurrentPeerView() != null && acVar.getCurrentItem() == i11) {
                                f6 currentPeerView = acVar.getCurrentPeerView();
                                if (currentPeerView.J1 != i15) {
                                    currentPeerView.J1 = i15;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                acVar.x(i11, false);
                                f6 currentPeerView2 = acVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    na naVar = (na) currentPeerView2.getParent();
                                    naVar.a(true);
                                    if (acVar.f1542x0 != null) {
                                        f6 f6Var = naVar.f1487a;
                                        long j3 = naVar.f1488b;
                                        ArrayList arrayList = naVar.f1489c;
                                        f6Var.B1 = j3;
                                        f6Var.f1027z1 = arrayList;
                                        f6Var.o0(i15);
                                    } else {
                                        naVar.f1487a.U0(i15, naVar.f1488b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = m7Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.f1(false);
                }
                m7Var.d.abortAnimation();
                ValueAnimator valueAnimator = m7Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m7Var.M = null;
                }
                m7Var.c(m7Var.K, false, true);
            }
            if (t10 != null) {
                b5 b5Var = t10.f955c1;
                m7Var.f1466a = b5Var.getTop();
                m7Var.f1467b = b5Var.getMeasuredWidth();
                m7Var.f1468c = b5Var.getMeasuredHeight();
            }
            m7Var.setProgressToOpen(this.f1742f);
            n7 n7Var = this.E;
            if (n7Var.f1477w0 && this.f1742f != 1.0f) {
                n7Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f1742f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f1742f != 1.0f) {
                n7Var.f1477w0 = false;
            }
        }
    }
}
