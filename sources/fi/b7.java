package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.zi0;
import org.telegram.ui.zv0;
public final class b7 implements e9 {
    public final uj0 f11568a;
    public final zv0 f11569b;
    public final int[] f11570c;
    public final boolean d;
    public a7 f11571e;
    public boolean f11572f;
    public boolean h;
    public boolean f11573n;
    public boolean f11574r;
    public int f11575s;

    public b7(uj0 uj0Var, boolean z10) {
        this.f11570c = new int[2];
        this.f11568a = uj0Var;
        this.d = z10;
        this.f11569b = null;
    }

    public static b7 a(uj0 uj0Var) {
        return new b7(uj0Var, false);
    }

    public final void b(f9 f9Var) {
        View view = f9Var.f11715g;
        if (view == null) {
            return;
        }
        if (view instanceof z6) {
            int[] iArr = this.f11570c;
            ((z6) view).a(iArr);
            f9Var.h = iArr[0];
            f9Var.f11716i = iArr[1] - this.f11575s;
        } else if (view instanceof t9) {
            f9Var.h = ((t9) view).f39610f3;
            f9Var.f11716i = (view.getMeasuredHeight() - f9Var.f11715g.getPaddingBottom()) - this.f11575s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.f11716i = (f9Var.f11715g.getMeasuredHeight() - f9Var.f11715g.getPaddingBottom()) - this.f11575s;
        }
    }

    @Override
    public final void c(boolean z10) {
        a7 a7Var = this.f11571e;
        if (a7Var != null) {
            a7Var.c(z10);
        }
    }

    @Override
    public final void d(long j3, int i7, g3 g3Var) {
        ArrayList arrayList;
        uj0 uj0Var = this.f11568a;
        if (uj0Var != null && (uj0Var.getParent() instanceof q)) {
            q qVar = (q) uj0Var.getParent();
            if (qVar.k(j3)) {
                qVar.f12189c0.add(g3Var);
                return;
            } else {
                g3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (uj0Var != null && (uj0Var.getParent() instanceof c5)) {
            c5 c5Var = (c5) uj0Var.getParent();
            qy qyVar = c5Var.f11607y;
            y4 y4Var = c5Var.f11606x;
            if (y4Var != null && (arrayList = y4Var.f12546c) != null && qyVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        t4 t4Var = (t4) arrayList.get(i10);
                        if (t4Var != null) {
                            TL_stories.StoryReaction storyReaction = t4Var.f12363c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f28290id == i7) {
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
                    int L0 = qyVar.L0();
                    int N0 = qyVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        qyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                        uj0Var.post(g3Var);
                        return;
                    }
                }
            }
            g3Var.run();
            return;
        }
        if (this.d) {
            s6 P1 = np.s1(m10.f24940t0).P1();
            ArrayList arrayList2 = P1.h;
            P1.v(arrayList2);
            Collections.sort(arrayList2, P1.J);
            ns.f(P1.f12319a).k(ns.f25592v5, new Object[0]);
        }
        g3Var.run();
    }

    @Override
    public final boolean l(long j3, int i7, int i10, int i11, f9 f9Var) {
        q qVar;
        ViewGroup viewGroup;
        boolean z10;
        c9 c9Var = null;
        f9Var.f11710a = null;
        f9Var.f11711b = null;
        f9Var.f11712c = null;
        f9Var.f11713e = null;
        uj0 uj0Var = this.f11568a;
        if (uj0Var != null && (uj0Var.getParent() instanceof q)) {
            qVar = (q) uj0Var.getParent();
        } else {
            qVar = null;
        }
        if (qVar != null && !qVar.g()) {
            viewGroup = qVar.f12206r;
        } else {
            viewGroup = uj0Var;
        }
        ViewGroup viewGroup2 = this.f11569b;
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
                        f9Var.f11710a = childAt;
                        f9Var.f11711b = pVar.f12152r;
                        f9Var.f11720m = pVar.P;
                        f9Var.d = pVar.S;
                        q qVar2 = (q) pVar.getParent().getParent();
                        f9Var.f11715g = qVar2;
                        f9Var.f11716i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.f11718k = 1.0f;
                        if (pVar.H && qVar2.g()) {
                            f9Var.f11714f = new di.z6(new Path(), 8);
                            return true;
                        }
                        f9Var.f11714f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Z1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.f31645v0;
                    int i13 = (t2Var.getDialogId() > j3 ? 1 : (t2Var.getDialogId() == j3 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i13 == 0 && !z11) || (z11 && t2Var.X())) {
                        f9Var.f11710a = childAt;
                        f9Var.f11720m = m2Var;
                        f9Var.f11711b = imageReceiver;
                        f9Var.f11715g = (View) t2Var.getParent();
                        if (z11) {
                            f9Var.f11719l = imageReceiver;
                            boolean z12 = m2Var.f11797w;
                        }
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().e1() == i7) {
                        f9Var.f11710a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            f9Var.f11712c = q1Var.T7;
                        } else {
                            f9Var.f11712c = q1Var.getPhotoImage();
                        }
                        f9Var.f11715g = (View) q1Var.getParent();
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().e1() == i7) {
                        f9Var.f11710a = childAt;
                        if (t0Var.getMessageObject().f23819k.media.storyItem.noforwards) {
                            f9Var.f11711b = t0Var.getPhotoImage();
                        } else {
                            f9Var.f11712c = t0Var.getPhotoImage();
                        }
                        f9Var.f11715g = (View) t0Var.getParent();
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.n7) && uj0Var != null) {
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                    gj messageObject = n7Var.getMessageObject();
                    if ((n7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.f23824l.dialogId == j3)) {
                        zi0 fastScroll = uj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.f11710a = childAt;
                        f9Var.f11712c = n7Var.f30744c;
                        f9Var.f11713e = new a3.h(n7Var, fastScroll, iArr, 8);
                        f9Var.f11715g = (View) n7Var.getParent();
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j3) {
                        v3 v3Var = paVar.f30883a;
                        f9Var.f11710a = v3Var;
                        f9Var.f11720m = paVar.U;
                        f9Var.f11711b = v3Var.getImageReceiver();
                        f9Var.f11715g = (View) paVar.getParent();
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l6) {
                    org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                    org.telegram.ui.Components.i9 i9Var = l6Var.h;
                    if (l6Var.E != j3) {
                        continue;
                    } else {
                        if (i9Var != null && i9Var.getImageReceiver() != null && i9Var.getImageReceiver().T != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (l6Var.f30640n == i10 && z10) {
                            f9Var.f11710a = i9Var;
                            f9Var.f11712c = i9Var.getImageReceiver();
                            f9Var.f11715g = (View) l6Var.getParent();
                            float alphaInternal = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.f11718k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.f11717j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.k6 k6Var = l6Var.f30637c;
                            f9Var.f11710a = k6Var;
                            f9Var.f11720m = l6Var.F;
                            f9Var.f11711b = k6Var.getImageReceiver();
                            f9Var.f11715g = (View) l6Var.getParent();
                            float alphaInternal2 = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.f11718k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.f11717j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (f6Var.getDialogId() == j3) {
                        f9Var.f11710a = f6Var;
                        f9Var.f11720m = f6Var.f30263v0;
                        f9Var.f11711b = f6Var.f30257r;
                        f9Var.f11715g = (View) f6Var.getParent();
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v7) {
                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                    if (v7Var.getPostInfo().b() == i10) {
                        f9Var.f11710a = v7Var.getImageView();
                        f9Var.f11720m = v7Var.getStoryAvatarParams();
                        f9Var.f11712c = v7Var.getImageView().getImageReceiver();
                        f9Var.f11715g = (View) v7Var.getParent();
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        f9Var.f11710a = a5Var.getAvatarImageView();
                        f9Var.f11720m = a5Var.getStoryAvatarParams();
                        f9Var.f11711b = a5Var.getAvatarImageView().getImageReceiver();
                        f9Var.f11715g = (View) a5Var.getParent();
                        f9Var.f11718k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                c9Var = null;
            }
        }
        return false;
    }

    public b7(zv0 zv0Var) {
        this.f11570c = new int[2];
        this.f11569b = zv0Var;
        this.f11568a = null;
    }
}
