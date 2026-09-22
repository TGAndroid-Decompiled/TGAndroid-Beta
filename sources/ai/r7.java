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
public final class r7 extends FrameLayout {
    public final l7 E;
    public final ArrayList F;
    public final ArrayList G;
    public final u6 H;
    public float I;
    public final o7 f1468a;
    public float f1469b;
    public float f1470c;
    public float d;
    public final p7 e;
    public float f1471f;
    public final k7 h;
    public float f1472n;
    public final jc f1473r;
    public final Drawable f1474s;
    public float v;
    public boolean f1475w;
    public int f1476x;
    public long f1477y;

    public r7(jc jcVar, Context context) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new u6();
        d dVar = jcVar.f1118y;
        this.f1473r = jcVar;
        k7 k7Var = new k7(this, jcVar, getContext());
        this.h = k7Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f1474s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, dVar), PorterDuff.Mode.MULTIPLY));
        p7 p7Var = new p7(this, context);
        this.e = p7Var;
        l7 l7Var = new l7(this, context);
        this.E = l7Var;
        l7Var.b(new m7(this, 0));
        o7 o7Var = new o7(this, jcVar, context);
        this.f1468a = o7Var;
        l7Var.setAdapter(o7Var);
        p7Var.addView(l7Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(k7Var, w7.x5.c(-1.0f, -1));
        addView(p7Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        j7 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f1477y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f1427a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f1473r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f1428b = (k9) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        k7 k7Var = this.h;
        ArrayList arrayList3 = k7Var.G;
        ArrayList arrayList4 = k7Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        k7Var.d();
        if (k7Var.getMeasuredHeight() > 0) {
            k7Var.c(i10, false, false);
        } else {
            k7Var.f1294w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((m6) arrayList3.get(i13)).a(((m6) arrayList3.get(i13)).f1249b);
        }
        l7 l7Var = this.E;
        l7Var.setAdapter(null);
        o7 o7Var = this.f1468a;
        l7Var.setAdapter(o7Var);
        o7Var.g();
        l7Var.setCurrentItem(i10);
    }

    public m6 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public j7 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((j7) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (j7) arrayList.get(i10);
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
                return ((q7) arrayList.get(closestPosition)).f1427a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f1473r.f1067b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        k7 k7Var = this.h;
        ((FrameLayout.LayoutParams) k7Var.getLayoutParams()).topMargin = i12;
        this.f1472n = k7Var.getFinalHeight();
        this.f1469b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f1472n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f1470c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((j7) arrayList.get(i13)).setListBottomPadding(this.d);
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
        j7 currentPage;
        float f7;
        if (this.f1476x >= AndroidUtilities.dp(20.0f)) {
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
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19476w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f1476x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f1049r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f1046c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.w((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.p1.f19476w);
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
            float f10 = this.f1471f;
            float clamp = Utilities.clamp(f7 / this.f1470c, 1.0f, 0.0f);
            this.f1471f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            jc jcVar = this.f1473r;
            f6 t10 = jcVar.t();
            gc gcVar = jcVar.f1105s0;
            k7 k7Var = this.h;
            if (f10 == 1.0f && this.f1471f != 1.0f) {
                if (jcVar.O0 != null) {
                    MessageObject messageObject = (MessageObject) jcVar.O0.f718i.get(Utilities.clamp(k7Var.getClosestPosition(), jcVar.O0.f718i.size() - 1, 0));
                    long b10 = d9.b(messageObject);
                    ImageReceiver imageReceiver = gcVar.f914c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        gcVar.f914c = null;
                    }
                    zb zbVar = jcVar.f1093n0;
                    int i12 = messageObject.storyItem.f18344id;
                    jc jcVar2 = zbVar.N0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= zbVar.f1305x0.size()) {
                            break;
                        } else if (b10 == d9.b(jcVar2.O0.f(((Integer) ((ArrayList) zbVar.f1305x0.get(i13)).get(0)).intValue()))) {
                            if (jcVar2.R0) {
                                i11 = (zbVar.f1305x0.size() - 1) - i13;
                            } else {
                                i11 = i13;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < ((ArrayList) zbVar.f1305x0.get(i13)).size()) {
                                    if (((Integer) ((ArrayList) zbVar.f1305x0.get(i13)).get(i14)).intValue() == i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = 0;
                                    break;
                                }
                            }
                            if (zbVar.getCurrentPeerView() != null && zbVar.getCurrentItem() == i11) {
                                f6 currentPeerView = zbVar.getCurrentPeerView();
                                if (currentPeerView.J1 != i14) {
                                    currentPeerView.J1 = i14;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                zbVar.x(i11, false);
                                f6 currentPeerView2 = zbVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    ma maVar = (ma) currentPeerView2.getParent();
                                    maVar.a(true);
                                    if (zbVar.f1305x0 != null) {
                                        f6 f6Var = maVar.f1258a;
                                        long j3 = maVar.f1259b;
                                        ArrayList arrayList = maVar.f1260c;
                                        f6Var.B1 = j3;
                                        f6Var.f872z1 = arrayList;
                                        f6Var.o0(i14);
                                    } else {
                                        maVar.f1258a.U0(i14, maVar.f1259b);
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = k7Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.f1(false);
                }
                k7Var.d.abortAnimation();
                ValueAnimator valueAnimator = k7Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    k7Var.M = null;
                }
                k7Var.c(k7Var.K, false, true);
            }
            if (t10 != null) {
                a5 a5Var = t10.f800c1;
                k7Var.f1287a = a5Var.getTop();
                k7Var.f1288b = a5Var.getMeasuredWidth();
                k7Var.f1289c = a5Var.getMeasuredHeight();
            }
            k7Var.setProgressToOpen(this.f1471f);
            l7 l7Var = this.E;
            if (l7Var.f1183w0 && this.f1471f != 1.0f) {
                l7Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f1471f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f1471f != 1.0f) {
                l7Var.f1183w0 = false;
            }
        }
    }
}
