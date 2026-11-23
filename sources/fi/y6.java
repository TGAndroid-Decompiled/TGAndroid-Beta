package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.vy;
import org.telegram.ui.aw0;
public final class y6 implements b9 {
    public final ek0 f12787a;
    public final aw0 f12788b;
    public final int[] f12789c;
    public final boolean d;
    public x6 f12790e;
    public boolean f12791f;
    public boolean h;
    public boolean f12792n;
    public boolean f12793r;
    public int f12794s;

    public y6(ek0 ek0Var, boolean z10) {
        this.f12789c = new int[2];
        this.f12787a = ek0Var;
        this.d = z10;
        this.f12788b = null;
    }

    public static y6 a(ek0 ek0Var) {
        return new y6(ek0Var, false);
    }

    public final void b(c9 c9Var) {
        View view = c9Var.f11826g;
        if (view == null) {
            return;
        }
        if (view instanceof w6) {
            int[] iArr = this.f12789c;
            ((w6) view).a(iArr);
            c9Var.h = iArr[0];
            c9Var.f11827i = iArr[1] - this.f12794s;
        } else if (view instanceof aa) {
            c9Var.h = ((aa) view).f33446f3;
            c9Var.f11827i = (view.getMeasuredHeight() - c9Var.f11826g.getPaddingBottom()) - this.f12794s;
        } else {
            c9Var.h = view.getPaddingTop();
            c9Var.f11827i = (c9Var.f11826g.getMeasuredHeight() - c9Var.f11826g.getPaddingBottom()) - this.f12794s;
        }
    }

    @Override
    public final void c(boolean z10) {
        x6 x6Var = this.f12790e;
        if (x6Var != null) {
            x6Var.c(z10);
        }
    }

    @Override
    public final void d(long j3, int i7, e3 e3Var) {
        ArrayList arrayList;
        ek0 ek0Var = this.f12787a;
        if (ek0Var != null && (ek0Var.getParent() instanceof q)) {
            q qVar = (q) ek0Var.getParent();
            if (qVar.k(j3)) {
                qVar.f12419c0.add(e3Var);
                return;
            } else {
                e3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (ek0Var != null && (ek0Var.getParent() instanceof b5)) {
            b5 b5Var = (b5) ek0Var.getParent();
            vy vyVar = b5Var.f11784y;
            x4 x4Var = b5Var.f11783x;
            if (x4Var != null && (arrayList = x4Var.f12736c) != null && vyVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        s4 s4Var = (s4) arrayList.get(i10);
                        if (s4Var != null) {
                            TL_stories.StoryReaction storyReaction = s4Var.f12525c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.n5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f28731id == i7) {
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
                    int L0 = vyVar.L0();
                    int N0 = vyVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        vyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                        ek0Var.post(e3Var);
                        return;
                    }
                }
            }
            e3Var.run();
            return;
        }
        if (this.d) {
            p6 R1 = mp.u1(i10.f24637t0).R1();
            ArrayList arrayList2 = R1.h;
            R1.v(arrayList2);
            Collections.sort(arrayList2, R1.J);
            ks.f(R1.f12387a).k(ks.f25329y5, new Object[0]);
        }
        e3Var.run();
    }

    @Override
    public final boolean l(long j3, int i7, int i10, int i11, c9 c9Var) {
        z8 z8Var = null;
        c9Var.f11821a = null;
        c9Var.f11822b = null;
        c9Var.f11823c = null;
        c9Var.f11824e = null;
        ek0 ek0Var = this.f12787a;
        q qVar = (ek0Var == null || !(ek0Var.getParent() instanceof q)) ? null : (q) ek0Var.getParent();
        ViewGroup viewGroup = (qVar == null || qVar.g()) ? ek0Var : qVar.f12436r;
        ViewGroup viewGroup2 = this.f12788b;
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
                        c9Var.f11821a = childAt;
                        c9Var.f11822b = pVar.f12368r;
                        c9Var.f11831m = pVar.P;
                        c9Var.d = pVar.S;
                        q qVar2 = (q) pVar.getParent().getParent();
                        c9Var.f11826g = qVar2;
                        c9Var.f11827i = 0.0f;
                        c9Var.h = 0.0f;
                        c9Var.f11829k = 1.0f;
                        if (pVar.H && qVar2.g()) {
                            c9Var.f11825f = new di.v6(new Path(), 9);
                            return true;
                        }
                        c9Var.f11825f = z8Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u2) {
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                    ImageReceiver imageReceiver = u2Var.Z1;
                    org.telegram.ui.Cells.n2 n2Var = u2Var.f32076v0;
                    int i13 = (u2Var.getDialogId() > j3 ? 1 : (u2Var.getDialogId() == j3 ? 0 : -1));
                    boolean z10 = this.d;
                    if ((i13 == 0 && !z10) || (z10 && u2Var.X())) {
                        c9Var.f11821a = childAt;
                        c9Var.f11831m = n2Var;
                        c9Var.f11822b = imageReceiver;
                        c9Var.f11826g = (View) u2Var.getParent();
                        if (z10) {
                            c9Var.f11830l = imageReceiver;
                            boolean z11 = n2Var.f11915w;
                        }
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.getMessageObject().e1() == i7) {
                        c9Var.f11821a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            c9Var.f11823c = r1Var.T7;
                        } else {
                            c9Var.f11823c = r1Var.getPhotoImage();
                        }
                        c9Var.f11826g = (View) r1Var.getParent();
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().e1() == i7) {
                        c9Var.f11821a = childAt;
                        if (v0Var.getMessageObject().f24073k.media.storyItem.noforwards) {
                            c9Var.f11822b = v0Var.getPhotoImage();
                        } else {
                            c9Var.f11823c = v0Var.getPhotoImage();
                        }
                        c9Var.f11826g = (View) v0Var.getParent();
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && ek0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    fj messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.f24078l.dialogId == j3)) {
                        jj0 fastScroll = ek0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        c9Var.f11821a = childAt;
                        c9Var.f11823c = o7Var.f31263c;
                        c9Var.f11824e = new a3.h(o7Var, fastScroll, iArr, 8);
                        c9Var.f11826g = (View) o7Var.getParent();
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
                        return true;
                    }
                } else if (childAt instanceof sa) {
                    sa saVar = (sa) childAt;
                    if (saVar.getDialogId() == j3) {
                        t3 t3Var = saVar.f31874a;
                        c9Var.f11821a = t3Var;
                        c9Var.f11831m = saVar.U;
                        c9Var.f11822b = t3Var.getImageReceiver();
                        c9Var.f11826g = (View) saVar.getParent();
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    p9 p9Var = m6Var.h;
                    if (m6Var.E != j3) {
                        continue;
                    } else {
                        boolean z12 = (p9Var == null || p9Var.getImageReceiver() == null || p9Var.getImageReceiver().T == null) ? false : true;
                        if (m6Var.f31160n == i10 && z12) {
                            c9Var.f11821a = p9Var;
                            c9Var.f11823c = p9Var.getImageReceiver();
                            c9Var.f11826g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            c9Var.f11829k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                c9Var.f11828j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, m6Var.getResourcesProvider()));
                            }
                            b(c9Var);
                            return true;
                        } else if (!z12) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.f31157c;
                            c9Var.f11821a = l6Var;
                            c9Var.f11831m = m6Var.F;
                            c9Var.f11822b = l6Var.getImageReceiver();
                            c9Var.f11826g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            c9Var.f11829k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                c9Var.f11828j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, m6Var.getResourcesProvider()));
                            }
                            b(c9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j3) {
                        c9Var.f11821a = g6Var;
                        c9Var.f11831m = g6Var.f30784v0;
                        c9Var.f11822b = g6Var.f30778r;
                        c9Var.f11826g = (View) g6Var.getParent();
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    if (w7Var.getPostInfo().b() == i10) {
                        c9Var.f11821a = w7Var.getImageView();
                        c9Var.f11831m = w7Var.getStoryAvatarParams();
                        c9Var.f11823c = w7Var.getImageView().getImageReceiver();
                        c9Var.f11826g = (View) w7Var.getParent();
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i7) {
                        c9Var.f11821a = b5Var.getAvatarImageView();
                        c9Var.f11831m = b5Var.getStoryAvatarParams();
                        c9Var.f11822b = b5Var.getAvatarImageView().getImageReceiver();
                        c9Var.f11826g = (View) b5Var.getParent();
                        c9Var.f11829k = 1.0f;
                        b(c9Var);
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

    public y6(aw0 aw0Var) {
        this.f12789c = new int[2];
        this.f12788b = aw0Var;
        this.f12787a = null;
    }
}
