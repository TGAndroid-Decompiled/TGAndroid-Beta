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
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.aw0;
public final class h7 implements l9 {
    public final pj0 f9086a;
    public final aw0 f9087b;
    public final int[] f9088c;
    public final boolean d;
    public g7 f9089e;
    public boolean f9090f;
    public boolean h;
    public boolean f9091n;
    public boolean f9092r;
    public int f9093s;

    public h7(pj0 pj0Var, boolean z9) {
        this.f9088c = new int[2];
        this.f9086a = pj0Var;
        this.d = z9;
        this.f9087b = null;
    }

    public static h7 a(pj0 pj0Var) {
        return new h7(pj0Var, false);
    }

    @Override
    public final void b(boolean z9) {
        g7 g7Var = this.f9089e;
        if (g7Var != null) {
            g7Var.b(z9);
        }
    }

    public final void c(m9 m9Var) {
        View view = m9Var.f9367g;
        if (view == null) {
            return;
        }
        if (view instanceof f7) {
            int[] iArr = this.f9088c;
            ((f7) view).a(iArr);
            m9Var.h = iArr[0];
            m9Var.f9368i = iArr[1] - this.f9093s;
        } else if (view instanceof org.telegram.ui.Components.x9) {
            m9Var.h = ((org.telegram.ui.Components.x9) view).f40212e3;
            m9Var.f9368i = (view.getMeasuredHeight() - m9Var.f9367g.getPaddingBottom()) - this.f9093s;
        } else {
            m9Var.h = view.getPaddingTop();
            m9Var.f9368i = (m9Var.f9367g.getMeasuredHeight() - m9Var.f9367g.getPaddingBottom()) - this.f9093s;
        }
    }

    @Override
    public final void e(long j3, int i7, l3 l3Var) {
        ArrayList arrayList;
        pj0 pj0Var = this.f9086a;
        if (pj0Var != null && (pj0Var.getParent() instanceof q)) {
            q qVar = (q) pj0Var.getParent();
            if (qVar.k(j3)) {
                qVar.f9588b0.add(l3Var);
                return;
            } else {
                l3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (pj0Var != null && (pj0Var.getParent() instanceof k5)) {
            k5 k5Var = (k5) pj0Var.getParent();
            ly lyVar = k5Var.f9309y;
            g5 g5Var = k5Var.f9308x;
            if (g5Var != null && (arrayList = g5Var.f9047c) != null && lyVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        b5 b5Var = (b5) arrayList.get(i10);
                        if (b5Var != null) {
                            TL_stories.StoryReaction storyReaction = b5Var.f8845c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f27191id == i7) {
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
                    int L0 = lyVar.L0();
                    int N0 = lyVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        lyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                        pj0Var.post(l3Var);
                        return;
                    }
                }
            }
            l3Var.run();
            return;
        }
        if (this.d) {
            y6 P1 = qp.s1(p10.f24459s0).P1();
            ArrayList arrayList2 = P1.h;
            P1.v(arrayList2);
            Collections.sort(arrayList2, P1.J);
            qs.f(P1.f9963a).k(qs.f25078v5, new Object[0]);
        }
        l3Var.run();
    }

    @Override
    public final boolean o(long j3, int i7, int i10, int i11, m9 m9Var) {
        q qVar;
        ViewGroup viewGroup;
        boolean z9;
        j9 j9Var = null;
        m9Var.f9362a = null;
        m9Var.f9363b = null;
        m9Var.f9364c = null;
        m9Var.f9365e = null;
        pj0 pj0Var = this.f9086a;
        if (pj0Var != null && (pj0Var.getParent() instanceof q)) {
            qVar = (q) pj0Var.getParent();
        } else {
            qVar = null;
        }
        if (qVar != null && !qVar.g()) {
            viewGroup = qVar.f9607r;
        } else {
            viewGroup = pj0Var;
        }
        ViewGroup viewGroup2 = this.f9087b;
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
                        m9Var.f9362a = childAt;
                        m9Var.f9363b = pVar.f9490r;
                        m9Var.f9372m = pVar.O;
                        m9Var.d = pVar.R;
                        q qVar2 = (q) pVar.getParent().getParent();
                        m9Var.f9367g = qVar2;
                        m9Var.f9368i = 0.0f;
                        m9Var.h = 0.0f;
                        m9Var.f9370k = 1.0f;
                        if (pVar.G && qVar2.g()) {
                            m9Var.f9366f = new q4(new Path(), 1);
                            return true;
                        }
                        m9Var.f9366f = j9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Y1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.f30483u0;
                    int i13 = (t2Var.getDialogId() > j3 ? 1 : (t2Var.getDialogId() == j3 ? 0 : -1));
                    boolean z10 = this.d;
                    if ((i13 == 0 && !z10) || (z10 && t2Var.U())) {
                        m9Var.f9362a = childAt;
                        m9Var.f9372m = m2Var;
                        m9Var.f9363b = imageReceiver;
                        m9Var.f9367g = (View) t2Var.getParent();
                        if (z10) {
                            m9Var.f9371l = imageReceiver;
                            boolean z11 = m2Var.f9427w;
                        }
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().f1() == i7) {
                        m9Var.f9362a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            m9Var.f9364c = q1Var.S7;
                        } else {
                            m9Var.f9364c = q1Var.getPhotoImage();
                        }
                        m9Var.f9367g = (View) q1Var.getParent();
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().f1() == i7) {
                        m9Var.f9362a = childAt;
                        if (t0Var.getMessageObject().f23237k.media.storyItem.noforwards) {
                            m9Var.f9363b = t0Var.getPhotoImage();
                        } else {
                            m9Var.f9364c = t0Var.getPhotoImage();
                        }
                        m9Var.f9367g = (View) t0Var.getParent();
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && pj0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    ij messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.y4() && messageObject.f1() == i10 && messageObject.f23241l.dialogId == j3)) {
                        ui0 fastScroll = pj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        m9Var.f9362a = childAt;
                        m9Var.f9364c = o7Var.f29660c;
                        m9Var.f9365e = new a3.h(o7Var, fastScroll, iArr, 7);
                        m9Var.f9367g = (View) o7Var.getParent();
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j3) {
                        c4 c4Var = paVar.f29747a;
                        m9Var.f9362a = c4Var;
                        m9Var.f9372m = paVar.T;
                        m9Var.f9363b = c4Var.getImageReceiver();
                        m9Var.f9367g = (View) paVar.getParent();
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
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
                        if (m6Var.f29550n == i10 && z9) {
                            m9Var.f9362a = l9Var;
                            m9Var.f9364c = l9Var.getImageReceiver();
                            m9Var.f9367g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            m9Var.f9370k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                m9Var.f9369j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, m6Var.getResourcesProvider()));
                            }
                            c(m9Var);
                            return true;
                        } else if (!z9) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.f29547c;
                            m9Var.f9362a = l6Var;
                            m9Var.f9372m = m6Var.E;
                            m9Var.f9363b = l6Var.getImageReceiver();
                            m9Var.f9367g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            m9Var.f9370k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                m9Var.f9369j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, m6Var.getResourcesProvider()));
                            }
                            c(m9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j3) {
                        m9Var.f9362a = g6Var;
                        m9Var.f9372m = g6Var.f29166u0;
                        m9Var.f9363b = g6Var.f29161r;
                        m9Var.f9367g = (View) g6Var.getParent();
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    if (w7Var.getPostInfo().b() == i10) {
                        m9Var.f9362a = w7Var.getImageView();
                        m9Var.f9372m = w7Var.getStoryAvatarParams();
                        m9Var.f9364c = w7Var.getImageView().getImageReceiver();
                        m9Var.f9367g = (View) w7Var.getParent();
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        m9Var.f9362a = a5Var.getAvatarImageView();
                        m9Var.f9372m = a5Var.getStoryAvatarParams();
                        m9Var.f9363b = a5Var.getAvatarImageView().getImageReceiver();
                        m9Var.f9367g = (View) a5Var.getParent();
                        m9Var.f9370k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                j9Var = null;
            }
        }
        return false;
    }

    public h7(aw0 aw0Var) {
        this.f9088c = new int[2];
        this.f9087b = aw0Var;
        this.f9086a = null;
    }
}
