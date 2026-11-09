package di;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.cw0;
public final class i7 implements m9 {
    public final qj0 f9116a;
    public final cw0 f9117b;
    public final int[] f9118c;
    public final boolean d;
    public h7 f9119e;
    public boolean f9120f;
    public boolean h;
    public boolean f9121n;
    public boolean f9122r;
    public int f9123s;

    public i7(qj0 qj0Var, boolean z9) {
        this.f9118c = new int[2];
        this.f9116a = qj0Var;
        this.d = z9;
        this.f9117b = null;
    }

    public static i7 a(qj0 qj0Var) {
        return new i7(qj0Var, false);
    }

    @Override
    public final void b(boolean z9) {
        h7 h7Var = this.f9119e;
        if (h7Var != null) {
            h7Var.b(z9);
        }
    }

    public final void c(n9 n9Var) {
        View view = n9Var.f9408g;
        if (view == null) {
            return;
        }
        if (view instanceof g7) {
            int[] iArr = this.f9118c;
            ((g7) view).a(iArr);
            n9Var.h = iArr[0];
            n9Var.f9409i = iArr[1] - this.f9123s;
        } else if (view instanceof org.telegram.ui.Components.x9) {
            n9Var.h = ((org.telegram.ui.Components.x9) view).f40344e3;
            n9Var.f9409i = (view.getMeasuredHeight() - n9Var.f9408g.getPaddingBottom()) - this.f9123s;
        } else {
            n9Var.h = view.getPaddingTop();
            n9Var.f9409i = (n9Var.f9408g.getMeasuredHeight() - n9Var.f9408g.getPaddingBottom()) - this.f9123s;
        }
    }

    @Override
    public final void e(long j3, int i7, l3 l3Var) {
        ArrayList arrayList;
        qj0 qj0Var = this.f9116a;
        if (qj0Var != null && (qj0Var.getParent() instanceof q)) {
            q qVar = (q) qj0Var.getParent();
            if (qVar.k(j3)) {
                qVar.f9529b0.add(l3Var);
                return;
            } else {
                l3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (qj0Var != null && (qj0Var.getParent() instanceof l5)) {
            l5 l5Var = (l5) qj0Var.getParent();
            my myVar = l5Var.f9333y;
            h5 h5Var = l5Var.f9332x;
            if (h5Var != null && (arrayList = h5Var.f9073c) != null && myVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        c5 c5Var = (c5) arrayList.get(i10);
                        if (c5Var != null) {
                            TL_stories.StoryReaction storyReaction = c5Var.f8871c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f27195id == i7) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    int L0 = myVar.L0();
                    int N0 = myVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        myVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                        qj0Var.post(l3Var);
                        return;
                    }
                }
            }
            l3Var.run();
            return;
        }
        if (this.d) {
            z6 P1 = qp.s1(p10.f24470s0).P1();
            ArrayList arrayList2 = P1.h;
            P1.v(arrayList2);
            Collections.sort(arrayList2, P1.J);
            qs.f(P1.f9992a).k(qs.f25095v5, new Object[0]);
        }
        l3Var.run();
    }

    @Override
    public final boolean o(long j3, int i7, int i10, int i11, n9 n9Var) {
        q qVar;
        ViewGroup viewGroup;
        boolean z9;
        k9 k9Var = null;
        n9Var.f9403a = null;
        n9Var.f9404b = null;
        n9Var.f9405c = null;
        n9Var.f9406e = null;
        qj0 qj0Var = this.f9116a;
        if (qj0Var != null && (qj0Var.getParent() instanceof q)) {
            qVar = (q) qj0Var.getParent();
        } else {
            qVar = null;
        }
        if (qVar != null && !qVar.g()) {
            viewGroup = qVar.f9548r;
        } else {
            viewGroup = qj0Var;
        }
        ViewGroup viewGroup2 = this.f9117b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i12 = 0;
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof p) {
                    p pVar = (p) childAt;
                    if (pVar.E == j3) {
                        n9Var.f9403a = childAt;
                        n9Var.f9404b = pVar.f9479r;
                        n9Var.f9413m = pVar.O;
                        n9Var.d = pVar.R;
                        q qVar2 = (q) pVar.getParent().getParent();
                        n9Var.f9408g = qVar2;
                        n9Var.f9409i = 0.0f;
                        n9Var.h = 0.0f;
                        n9Var.f9411k = 1.0f;
                        if (pVar.G && qVar2.g()) {
                            n9Var.f9407f = new r4(new Path(), 1);
                            return true;
                        }
                        n9Var.f9407f = k9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Y1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.f30492u0;
                    int i13 = (t2Var.getDialogId() > j3 ? 1 : (t2Var.getDialogId() == j3 ? 0 : -1));
                    boolean z10 = this.d;
                    if ((i13 == 0 && !z10) || (z10 && t2Var.U())) {
                        n9Var.f9403a = childAt;
                        n9Var.f9413m = m2Var;
                        n9Var.f9404b = imageReceiver;
                        n9Var.f9408g = (View) t2Var.getParent();
                        if (z10) {
                            n9Var.f9412l = imageReceiver;
                            boolean z11 = m2Var.f9460w;
                        }
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().e1() == i7) {
                        n9Var.f9403a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            n9Var.f9405c = q1Var.S7;
                        } else {
                            n9Var.f9405c = q1Var.getPhotoImage();
                        }
                        n9Var.f9408g = (View) q1Var.getParent();
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().e1() == i7) {
                        n9Var.f9403a = childAt;
                        if (t0Var.getMessageObject().f23262k.media.storyItem.noforwards) {
                            n9Var.f9404b = t0Var.getPhotoImage();
                        } else {
                            n9Var.f9405c = t0Var.getPhotoImage();
                        }
                        n9Var.f9408g = (View) t0Var.getParent();
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && qj0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    ij messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.f23266l.dialogId == j3)) {
                        vi0 fastScroll = qj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        n9Var.f9403a = childAt;
                        n9Var.f9405c = o7Var.f29668c;
                        n9Var.f9406e = new a3.h(o7Var, fastScroll, iArr, 7);
                        n9Var.f9408g = (View) o7Var.getParent();
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j3) {
                        d4 d4Var = paVar.f29755a;
                        n9Var.f9403a = d4Var;
                        n9Var.f9413m = paVar.T;
                        n9Var.f9404b = d4Var.getImageReceiver();
                        n9Var.f9408g = (View) paVar.getParent();
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    org.telegram.ui.Components.l9 l9Var = m6Var.h;
                    if (m6Var.D != j3) {
                        continue;
                    } else {
                        if (l9Var != null && l9Var.getImageReceiver() != null && l9Var.getImageReceiver().S != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (m6Var.f29558n == i10 && z9) {
                            n9Var.f9403a = l9Var;
                            n9Var.f9405c = l9Var.getImageReceiver();
                            n9Var.f9408g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            n9Var.f9411k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                n9Var.f9410j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, m6Var.getResourcesProvider()));
                            }
                            c(n9Var);
                            return true;
                        } else if (!z9) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.f29555c;
                            n9Var.f9403a = l6Var;
                            n9Var.f9413m = m6Var.E;
                            n9Var.f9404b = l6Var.getImageReceiver();
                            n9Var.f9408g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            n9Var.f9411k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                n9Var.f9410j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, m6Var.getResourcesProvider()));
                            }
                            c(n9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j3) {
                        n9Var.f9403a = g6Var;
                        n9Var.f9413m = g6Var.f29174u0;
                        n9Var.f9404b = g6Var.f29169r;
                        n9Var.f9408g = (View) g6Var.getParent();
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    if (w7Var.getPostInfo().b() == i10) {
                        n9Var.f9403a = w7Var.getImageView();
                        n9Var.f9413m = w7Var.getStoryAvatarParams();
                        n9Var.f9405c = w7Var.getImageView().getImageReceiver();
                        n9Var.f9408g = (View) w7Var.getParent();
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        n9Var.f9403a = a5Var.getAvatarImageView();
                        n9Var.f9413m = a5Var.getStoryAvatarParams();
                        n9Var.f9404b = a5Var.getAvatarImageView().getImageReceiver();
                        n9Var.f9408g = (View) a5Var.getParent();
                        n9Var.f9411k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                k9Var = null;
            }
        }
        return false;
    }

    public i7(cw0 cw0Var) {
        this.f9118c = new int[2];
        this.f9117b = cw0Var;
        this.f9116a = null;
    }
}
