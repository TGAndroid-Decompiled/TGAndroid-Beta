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
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.yy;
import org.telegram.ui.bw0;
public final class y6 implements b9 {
    public final ek0 f12822a;
    public final bw0 f12823b;
    public final int[] f12824c;
    public final boolean d;
    public x6 f12825e;
    public boolean f12826f;
    public boolean h;
    public boolean f12827n;
    public boolean f12828r;
    public int f12829s;

    public y6(ek0 ek0Var, boolean z10) {
        this.f12824c = new int[2];
        this.f12822a = ek0Var;
        this.d = z10;
        this.f12823b = null;
    }

    public static y6 a(ek0 ek0Var) {
        return new y6(ek0Var, false);
    }

    @Override
    public final void b(boolean z10) {
        x6 x6Var = this.f12825e;
        if (x6Var != null) {
            x6Var.b(z10);
        }
    }

    public final void c(c9 c9Var) {
        View view = c9Var.f11861g;
        if (view == null) {
            return;
        }
        if (view instanceof w6) {
            int[] iArr = this.f12824c;
            ((w6) view).a(iArr);
            c9Var.h = iArr[0];
            c9Var.f11862i = iArr[1] - this.f12829s;
        } else if (view instanceof ba) {
            c9Var.h = ((ba) view).f33820f3;
            c9Var.f11862i = (view.getMeasuredHeight() - c9Var.f11861g.getPaddingBottom()) - this.f12829s;
        } else {
            c9Var.h = view.getPaddingTop();
            c9Var.f11862i = (c9Var.f11861g.getMeasuredHeight() - c9Var.f11861g.getPaddingBottom()) - this.f12829s;
        }
    }

    @Override
    public final void e(long j3, int i7, e3 e3Var) {
        ArrayList arrayList;
        ek0 ek0Var = this.f12822a;
        if (ek0Var != null && (ek0Var.getParent() instanceof q)) {
            q qVar = (q) ek0Var.getParent();
            if (qVar.k(j3)) {
                qVar.f12454c0.add(e3Var);
                return;
            } else {
                e3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (ek0Var != null && (ek0Var.getParent() instanceof b5)) {
            b5 b5Var = (b5) ek0Var.getParent();
            yy yyVar = b5Var.f11819y;
            x4 x4Var = b5Var.f11818x;
            if (x4Var != null && (arrayList = x4Var.f12771c) != null && yyVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        s4 s4Var = (s4) arrayList.get(i10);
                        if (s4Var != null) {
                            TL_stories.StoryReaction storyReaction = s4Var.f12560c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.n5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f28670id == i7) {
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
                    int L0 = yyVar.L0();
                    int N0 = yyVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        yyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                        ek0Var.post(e3Var);
                        return;
                    }
                }
            }
            e3Var.run();
            return;
        }
        if (this.d) {
            p6 R1 = mp.u1(j10.f24798t0).R1();
            ArrayList arrayList2 = R1.h;
            R1.v(arrayList2);
            Collections.sort(arrayList2, R1.J);
            ks.f(R1.f12422a).k(ks.f25258y5, new Object[0]);
        }
        e3Var.run();
    }

    @Override
    public final boolean k(long j3, int i7, int i10, int i11, c9 c9Var) {
        q qVar;
        ViewGroup viewGroup;
        boolean z10;
        z8 z8Var = null;
        c9Var.f11856a = null;
        c9Var.f11857b = null;
        c9Var.f11858c = null;
        c9Var.f11859e = null;
        ek0 ek0Var = this.f12822a;
        if (ek0Var != null && (ek0Var.getParent() instanceof q)) {
            qVar = (q) ek0Var.getParent();
        } else {
            qVar = null;
        }
        if (qVar != null && !qVar.g()) {
            viewGroup = qVar.f12471r;
        } else {
            viewGroup = ek0Var;
        }
        ViewGroup viewGroup2 = this.f12823b;
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
                        c9Var.f11856a = childAt;
                        c9Var.f11857b = pVar.f12403r;
                        c9Var.f11866m = pVar.P;
                        c9Var.d = pVar.S;
                        q qVar2 = (q) pVar.getParent().getParent();
                        c9Var.f11861g = qVar2;
                        c9Var.f11862i = 0.0f;
                        c9Var.h = 0.0f;
                        c9Var.f11864k = 1.0f;
                        if (pVar.H && qVar2.g()) {
                            c9Var.f11860f = new di.v6(new Path(), 9);
                            return true;
                        }
                        c9Var.f11860f = z8Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u2) {
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                    ImageReceiver imageReceiver = u2Var.Z1;
                    org.telegram.ui.Cells.n2 n2Var = u2Var.f32023v0;
                    int i13 = (u2Var.getDialogId() > j3 ? 1 : (u2Var.getDialogId() == j3 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i13 == 0 && !z11) || (z11 && u2Var.U())) {
                        c9Var.f11856a = childAt;
                        c9Var.f11866m = n2Var;
                        c9Var.f11857b = imageReceiver;
                        c9Var.f11861g = (View) u2Var.getParent();
                        if (z11) {
                            c9Var.f11865l = imageReceiver;
                            boolean z12 = n2Var.f11950w;
                        }
                        c9Var.f11864k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.getMessageObject().e1() == i7) {
                        c9Var.f11856a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            c9Var.f11858c = r1Var.T7;
                        } else {
                            c9Var.f11858c = r1Var.getPhotoImage();
                        }
                        c9Var.f11861g = (View) r1Var.getParent();
                        c9Var.f11864k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().e1() == i7) {
                        c9Var.f11856a = childAt;
                        if (v0Var.getMessageObject().f23993k.media.storyItem.noforwards) {
                            c9Var.f11857b = v0Var.getPhotoImage();
                        } else {
                            c9Var.f11858c = v0Var.getPhotoImage();
                        }
                        c9Var.f11861g = (View) v0Var.getParent();
                        c9Var.f11864k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.p7) && ek0Var != null) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    fj messageObject = p7Var.getMessageObject();
                    if ((p7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.f23998l.dialogId == j3)) {
                        jj0 fastScroll = ek0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        c9Var.f11856a = childAt;
                        c9Var.f11858c = p7Var.f31254c;
                        c9Var.f11859e = new a3.h(p7Var, fastScroll, iArr, 8);
                        c9Var.f11861g = (View) p7Var.getParent();
                        c9Var.f11864k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof ra) {
                    ra raVar = (ra) childAt;
                    if (raVar.getDialogId() == j3) {
                        t3 t3Var = raVar.f31750a;
                        c9Var.f11856a = t3Var;
                        c9Var.f11866m = raVar.U;
                        c9Var.f11857b = t3Var.getImageReceiver();
                        c9Var.f11861g = (View) raVar.getParent();
                        c9Var.f11864k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    q9 q9Var = n6Var.h;
                    if (n6Var.E != j3) {
                        continue;
                    } else {
                        if (q9Var != null && q9Var.getImageReceiver() != null && q9Var.getImageReceiver().T != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (n6Var.f31149n == i10 && z10) {
                            c9Var.f11856a = q9Var;
                            c9Var.f11858c = q9Var.getImageReceiver();
                            c9Var.f11861g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            c9Var.f11864k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                c9Var.f11863j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, n6Var.getResourcesProvider()));
                            }
                            c(c9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f31146c;
                            c9Var.f11856a = m6Var;
                            c9Var.f11866m = n6Var.F;
                            c9Var.f11857b = m6Var.getImageReceiver();
                            c9Var.f11861g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            c9Var.f11864k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                c9Var.f11863j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, n6Var.getResourcesProvider()));
                            }
                            c(c9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j3) {
                        c9Var.f11856a = h6Var;
                        c9Var.f11866m = h6Var.f30755v0;
                        c9Var.f11857b = h6Var.f30749r;
                        c9Var.f11861g = (View) h6Var.getParent();
                        c9Var.f11864k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) childAt;
                    if (x7Var.getPostInfo().b() == i10) {
                        c9Var.f11856a = x7Var.getImageView();
                        c9Var.f11866m = x7Var.getStoryAvatarParams();
                        c9Var.f11858c = x7Var.getImageView().getImageReceiver();
                        c9Var.f11861g = (View) x7Var.getParent();
                        c9Var.f11864k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i7) {
                        c9Var.f11856a = b5Var.getAvatarImageView();
                        c9Var.f11866m = b5Var.getStoryAvatarParams();
                        c9Var.f11857b = b5Var.getAvatarImageView().getImageReceiver();
                        c9Var.f11861g = (View) b5Var.getParent();
                        c9Var.f11864k = 1.0f;
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
        this.f12824c = new int[2];
        this.f12823b = bw0Var;
        this.f12822a = null;
    }
}
