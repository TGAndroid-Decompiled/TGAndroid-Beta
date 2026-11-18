package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.wy;
import org.telegram.ui.bw0;
public final class y6 implements b9 {
    public final ck0 f12784a;
    public final bw0 f12785b;
    public final int[] f12786c;
    public final boolean d;
    public x6 f12787e;
    public boolean f12788f;
    public boolean h;
    public boolean f12789n;
    public boolean f12790r;
    public int f12791s;

    public y6(ck0 ck0Var, boolean z10) {
        this.f12786c = new int[2];
        this.f12784a = ck0Var;
        this.d = z10;
        this.f12785b = null;
    }

    public static y6 a(ck0 ck0Var) {
        return new y6(ck0Var, false);
    }

    @Override
    public final void b(boolean z10) {
        x6 x6Var = this.f12787e;
        if (x6Var != null) {
            x6Var.b(z10);
        }
    }

    public final void c(c9 c9Var) {
        View view = c9Var.f11824g;
        if (view == null) {
            return;
        }
        if (view instanceof w6) {
            int[] iArr = this.f12786c;
            ((w6) view).a(iArr);
            c9Var.h = iArr[0];
            c9Var.f11825i = iArr[1] - this.f12791s;
        } else if (view instanceof ba) {
            c9Var.h = ((ba) view).f33614f3;
            c9Var.f11825i = (view.getMeasuredHeight() - c9Var.f11824g.getPaddingBottom()) - this.f12791s;
        } else {
            c9Var.h = view.getPaddingTop();
            c9Var.f11825i = (c9Var.f11824g.getMeasuredHeight() - c9Var.f11824g.getPaddingBottom()) - this.f12791s;
        }
    }

    @Override
    public final void e(long j3, int i7, e3 e3Var) {
        ArrayList arrayList;
        ck0 ck0Var = this.f12784a;
        if (ck0Var != null && (ck0Var.getParent() instanceof q)) {
            q qVar = (q) ck0Var.getParent();
            if (qVar.k(j3)) {
                qVar.f12417c0.add(e3Var);
                return;
            } else {
                e3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (ck0Var != null && (ck0Var.getParent() instanceof a5)) {
            a5 a5Var = (a5) ck0Var.getParent();
            wy wyVar = a5Var.f11738y;
            w4 w4Var = a5Var.f11737x;
            if (w4Var != null && (arrayList = w4Var.f12699c) != null && wyVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        r4 r4Var = (r4) arrayList.get(i10);
                        if (r4Var != null) {
                            TL_stories.StoryReaction storyReaction = r4Var.f12504c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.n5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f28644id == i7) {
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
                    int L0 = wyVar.L0();
                    int N0 = wyVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        wyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                        ck0Var.post(e3Var);
                        return;
                    }
                }
            }
            e3Var.run();
            return;
        }
        if (this.d) {
            p6 R1 = mp.u1(j10.f24773t0).R1();
            ArrayList arrayList2 = R1.h;
            R1.v(arrayList2);
            Collections.sort(arrayList2, R1.J);
            ks.f(R1.f12385a).k(ks.f25225x5, new Object[0]);
        }
        e3Var.run();
    }

    @Override
    public final boolean k(long j3, int i7, int i10, int i11, c9 c9Var) {
        q qVar;
        ViewGroup viewGroup;
        boolean z10;
        z8 z8Var = null;
        c9Var.f11819a = null;
        c9Var.f11820b = null;
        c9Var.f11821c = null;
        c9Var.f11822e = null;
        ck0 ck0Var = this.f12784a;
        if (ck0Var != null && (ck0Var.getParent() instanceof q)) {
            qVar = (q) ck0Var.getParent();
        } else {
            qVar = null;
        }
        if (qVar != null && !qVar.g()) {
            viewGroup = qVar.f12434r;
        } else {
            viewGroup = ck0Var;
        }
        ViewGroup viewGroup2 = this.f12785b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i12 = 0;
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof p) {
                    p pVar = (p) childAt;
                    if (pVar.F == j3) {
                        c9Var.f11819a = childAt;
                        c9Var.f11820b = pVar.f12364r;
                        c9Var.f11829m = pVar.P;
                        c9Var.d = pVar.S;
                        q qVar2 = (q) pVar.getParent().getParent();
                        c9Var.f11824g = qVar2;
                        c9Var.f11825i = 0.0f;
                        c9Var.h = 0.0f;
                        c9Var.f11827k = 1.0f;
                        if (pVar.H && qVar2.g()) {
                            c9Var.f11823f = new di.c7(new Path(), 8);
                            return true;
                        }
                        c9Var.f11823f = z8Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Z1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.f31947v0;
                    int i13 = (t2Var.getDialogId() > j3 ? 1 : (t2Var.getDialogId() == j3 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i13 == 0 && !z11) || (z11 && t2Var.U())) {
                        c9Var.f11819a = childAt;
                        c9Var.f11829m = m2Var;
                        c9Var.f11820b = imageReceiver;
                        c9Var.f11824g = (View) t2Var.getParent();
                        if (z11) {
                            c9Var.f11828l = imageReceiver;
                            boolean z12 = m2Var.f11911w;
                        }
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().e1() == i7) {
                        c9Var.f11819a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            c9Var.f11821c = q1Var.T7;
                        } else {
                            c9Var.f11821c = q1Var.getPhotoImage();
                        }
                        c9Var.f11824g = (View) q1Var.getParent();
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) childAt;
                    if (u0Var.getMessageObject().e1() == i7) {
                        c9Var.f11819a = childAt;
                        if (u0Var.getMessageObject().f23968k.media.storyItem.noforwards) {
                            c9Var.f11820b = u0Var.getPhotoImage();
                        } else {
                            c9Var.f11821c = u0Var.getPhotoImage();
                        }
                        c9Var.f11824g = (View) u0Var.getParent();
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && ck0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    fj messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.f23973l.dialogId == j3)) {
                        hj0 fastScroll = ck0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        c9Var.f11819a = childAt;
                        c9Var.f11821c = o7Var.f31179c;
                        c9Var.f11822e = new a3.h(o7Var, fastScroll, iArr, 8);
                        c9Var.f11824g = (View) o7Var.getParent();
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof qa) {
                    qa qaVar = (qa) childAt;
                    if (qaVar.getDialogId() == j3) {
                        t3 t3Var = qaVar.f31672a;
                        c9Var.f11819a = t3Var;
                        c9Var.f11829m = qaVar.U;
                        c9Var.f11820b = t3Var.getImageReceiver();
                        c9Var.f11824g = (View) qaVar.getParent();
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    q9 q9Var = m6Var.h;
                    if (m6Var.E != j3) {
                        continue;
                    } else {
                        if (q9Var != null && q9Var.getImageReceiver() != null && q9Var.getImageReceiver().T != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (m6Var.f31066n == i10 && z10) {
                            c9Var.f11819a = q9Var;
                            c9Var.f11821c = q9Var.getImageReceiver();
                            c9Var.f11824g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            c9Var.f11827k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                c9Var.f11826j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, m6Var.getResourcesProvider()));
                            }
                            c(c9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.f31063c;
                            c9Var.f11819a = l6Var;
                            c9Var.f11829m = m6Var.F;
                            c9Var.f11820b = l6Var.getImageReceiver();
                            c9Var.f11824g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            c9Var.f11827k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                c9Var.f11826j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, m6Var.getResourcesProvider()));
                            }
                            c(c9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j3) {
                        c9Var.f11819a = g6Var;
                        c9Var.f11829m = g6Var.f30678v0;
                        c9Var.f11820b = g6Var.f30672r;
                        c9Var.f11824g = (View) g6Var.getParent();
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    if (w7Var.getPostInfo().b() == i10) {
                        c9Var.f11819a = w7Var.getImageView();
                        c9Var.f11829m = w7Var.getStoryAvatarParams();
                        c9Var.f11821c = w7Var.getImageView().getImageReceiver();
                        c9Var.f11824g = (View) w7Var.getParent();
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        c9Var.f11819a = a5Var.getAvatarImageView();
                        c9Var.f11829m = a5Var.getStoryAvatarParams();
                        c9Var.f11820b = a5Var.getAvatarImageView().getImageReceiver();
                        c9Var.f11824g = (View) a5Var.getParent();
                        c9Var.f11827k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                z8Var = null;
            }
        }
        return false;
    }

    public y6(bw0 bw0Var) {
        this.f12786c = new int[2];
        this.f12785b = bw0Var;
        this.f12784a = null;
    }
}
