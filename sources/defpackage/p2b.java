package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class p2b implements i8b {
    public final o39 a;
    public final ao8 b;
    public final int[] c;
    public final boolean d;
    public o2b e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public p2b(o39 o39Var, boolean z) {
        this.c = new int[2];
        this.a = o39Var;
        this.d = z;
        this.b = null;
    }

    public static p2b a(o39 o39Var) {
        return new p2b(o39Var, false);
    }

    public final void b(j8b j8bVar) {
        View view = j8bVar.g;
        if (view == null) {
            return;
        }
        if (view instanceof n2b) {
            int[] iArr = this.c;
            ((n2b) view).b(iArr);
            j8bVar.h = iArr[0];
            j8bVar.i = iArr[1] - this.s;
        } else if (view instanceof rl0) {
            j8bVar.h = ((rl0) view).f3;
            j8bVar.i = (view.getMeasuredHeight() - j8bVar.g.getPaddingBottom()) - this.s;
        } else {
            j8bVar.h = view.getPaddingTop();
            j8bVar.i = (j8bVar.g.getMeasuredHeight() - j8bVar.g.getPaddingBottom()) - this.s;
        }
    }

    @Override
    public final void e1(long j, int i, g28 g28Var) {
        ArrayList arrayList;
        int i2 = 0;
        o39 o39Var = this.a;
        if (o39Var != null) {
            if (o39Var.getParent() instanceof vf3) {
                vf3 vf3Var = (vf3) o39Var.getParent();
                if (vf3Var.k(j)) {
                    vf3Var.c0.add(g28Var);
                    return;
                } else {
                    g28Var.run();
                    return;
                }
            } else if (o39Var.getParent() instanceof g0a) {
                g0a g0aVar = (g0a) o39Var.getParent();
                wb4 wb4Var = g0aVar.y;
                c0a c0aVar = g0aVar.x;
                if (c0aVar != null && (arrayList = c0aVar.c) != null && wb4Var != null) {
                    while (true) {
                        if (i2 < arrayList.size()) {
                            yz9 yz9Var = (yz9) arrayList.get(i2);
                            if (yz9Var != null) {
                                TL_stories.StoryReaction storyReaction = yz9Var.c;
                                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                    TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                    if (tL_storyReactionPublicRepost.story != null && cf3.n(tL_storyReactionPublicRepost.peer_id) == j && tL_storyReactionPublicRepost.story.id == i) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    if (i2 >= 0) {
                        int K0 = wb4Var.K0();
                        int M0 = wb4Var.M0();
                        if (i2 < K0 || i2 > M0) {
                            wb4Var.g1(i2, gl.L(60.0f));
                            o39Var.post(g28Var);
                            return;
                        }
                    }
                }
                g28Var.run();
                return;
            }
        }
        if (this.d) {
            g2b M1 = na7.q1(y6c.t0).M1();
            ArrayList arrayList2 = M1.h;
            M1.u(arrayList2);
            Collections.sort(arrayList2, M1.J);
            kk7.f(M1.a).k(kk7.x5, new Object[0]);
        }
        g28Var.run();
    }

    @Override
    public final void i(boolean z) {
        o2b o2bVar = this.e;
        if (o2bVar != null) {
            o2bVar.i(z);
        }
    }

    @Override
    public final boolean w(long j, int i, int i2, int i3, j8b j8bVar) {
        vf3 vf3Var;
        ViewGroup viewGroup;
        boolean z;
        g8b g8bVar = null;
        j8bVar.a = null;
        j8bVar.b = null;
        j8bVar.c = null;
        j8bVar.e = null;
        o39 o39Var = this.a;
        if (o39Var != null && (o39Var.getParent() instanceof vf3)) {
            vf3Var = (vf3) o39Var.getParent();
        } else {
            vf3Var = null;
        }
        if (vf3Var != null && !vf3Var.g()) {
            viewGroup = vf3Var.r;
        } else {
            viewGroup = o39Var;
        }
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i4 = 0;
            while (i4 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof uf3) {
                    uf3 uf3Var = (uf3) childAt;
                    if (uf3Var.F == j) {
                        j8bVar.a = childAt;
                        j8bVar.b = uf3Var.r;
                        j8bVar.m = uf3Var.P;
                        j8bVar.d = uf3Var.S;
                        vf3 vf3Var2 = (vf3) uf3Var.getParent().getParent();
                        j8bVar.g = vf3Var2;
                        j8bVar.i = 0.0f;
                        j8bVar.h = 0.0f;
                        j8bVar.k = 1.0f;
                        if (uf3Var.H && vf3Var2.g()) {
                            j8bVar.f = new hza(new Path(), (byte) 4);
                            return true;
                        }
                        j8bVar.f = g8bVar;
                        return true;
                    }
                } else if (childAt instanceof ue3) {
                    ue3 ue3Var = (ue3) childAt;
                    ImageReceiver imageReceiver = ue3Var.Z1;
                    me3 me3Var = ue3Var.v0;
                    int i5 = (ue3Var.getDialogId() > j ? 1 : (ue3Var.getDialogId() == j ? 0 : -1));
                    boolean z2 = this.d;
                    if ((i5 == 0 && !z2) || (z2 && ue3Var.X())) {
                        j8bVar.a = childAt;
                        j8bVar.m = me3Var;
                        j8bVar.b = imageReceiver;
                        j8bVar.g = (View) ue3Var.getParent();
                        if (z2) {
                            j8bVar.l = imageReceiver;
                            boolean z3 = me3Var.w;
                        }
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    if (gb2Var.getMessageObject().e1() == i) {
                        j8bVar.a = childAt;
                        if (i3 != 1 && i3 != 2) {
                            j8bVar.c = gb2Var.T7;
                        } else {
                            j8bVar.c = gb2Var.getPhotoImage();
                        }
                        j8bVar.g = (View) gb2Var.getParent();
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else if (childAt instanceof uk1) {
                    uk1 uk1Var = (uk1) childAt;
                    if (uk1Var.getMessageObject().e1() == i) {
                        j8bVar.a = childAt;
                        if (uk1Var.getMessageObject().k.media.storyItem.noforwards) {
                            j8bVar.b = uk1Var.getPhotoImage();
                        } else {
                            j8bVar.c = uk1Var.getPhotoImage();
                        }
                        j8bVar.g = (View) uk1Var.getParent();
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else if ((childAt instanceof qfa) && o39Var != null) {
                    qfa qfaVar = (qfa) childAt;
                    k27 messageObject = qfaVar.getMessageObject();
                    if ((qfaVar.getStyle() == 1 && i2 == 0) || (messageObject != null && messageObject.w4() && messageObject.e1() == i2 && messageObject.l.dialogId == j)) {
                        v29 fastScroll = o39Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        j8bVar.a = childAt;
                        j8bVar.c = qfaVar.c;
                        j8bVar.e = new io9(qfaVar, fastScroll, iArr, (byte) 6);
                        j8bVar.g = (View) qfaVar.getParent();
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else if (childAt instanceof v6c) {
                    v6c v6cVar = (v6c) childAt;
                    if (v6cVar.getDialogId() == j) {
                        kb0 kb0Var = v6cVar.a;
                        j8bVar.a = kb0Var;
                        j8bVar.m = v6cVar.U;
                        j8bVar.b = kb0Var.getImageReceiver();
                        j8bVar.g = (View) v6cVar.getParent();
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else if (childAt instanceof qz8) {
                    qz8 qz8Var = (qz8) childAt;
                    be0 be0Var = qz8Var.h;
                    if (qz8Var.E != j) {
                        continue;
                    } else {
                        if (be0Var != null && be0Var.getImageReceiver() != null && be0Var.getImageReceiver().T != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (qz8Var.n == i2 && z) {
                            j8bVar.a = be0Var;
                            j8bVar.c = be0Var.getImageReceiver();
                            j8bVar.g = (View) qz8Var.getParent();
                            float alphaInternal = qz8Var.getAlphaInternal() * qz8Var.getAlpha();
                            j8bVar.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                j8bVar.j = paint;
                                paint.setColor(bkb.v0(bkb.g5, qz8Var.getResourcesProvider()));
                            }
                            b(j8bVar);
                            return true;
                        } else if (!z) {
                            pz8 pz8Var = qz8Var.c;
                            j8bVar.a = pz8Var;
                            j8bVar.m = qz8Var.F;
                            j8bVar.b = pz8Var.getImageReceiver();
                            j8bVar.g = (View) qz8Var.getParent();
                            float alphaInternal2 = qz8Var.getAlphaInternal() * qz8Var.getAlpha();
                            j8bVar.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                j8bVar.j = paint2;
                                paint2.setColor(bkb.v0(bkb.g5, qz8Var.getResourcesProvider()));
                            }
                            b(j8bVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof rr8) {
                    rr8 rr8Var = (rr8) childAt;
                    if (rr8Var.getDialogId() == j) {
                        j8bVar.a = rr8Var;
                        j8bVar.m = rr8Var.v0;
                        j8bVar.b = rr8Var.r;
                        j8bVar.g = (View) rr8Var.getParent();
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else if (childAt instanceof xxa) {
                    xxa xxaVar = (xxa) childAt;
                    if (xxaVar.getPostInfo().b() == i2) {
                        j8bVar.a = xxaVar.getImageView();
                        j8bVar.m = xxaVar.getStoryAvatarParams();
                        j8bVar.c = xxaVar.getImageView().getImageReceiver();
                        j8bVar.g = (View) xxaVar.getParent();
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else if (childAt instanceof gh6) {
                    gh6 gh6Var = (gh6) childAt;
                    if (gh6Var.getStoryItem() != null && gh6Var.getStoryItem().dialogId == j && gh6Var.getStoryItem().messageId == i) {
                        j8bVar.a = gh6Var.getAvatarImageView();
                        j8bVar.m = gh6Var.getStoryAvatarParams();
                        j8bVar.b = gh6Var.getAvatarImageView().getImageReceiver();
                        j8bVar.g = (View) gh6Var.getParent();
                        j8bVar.k = 1.0f;
                        b(j8bVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i4++;
                g8bVar = null;
            }
        }
        return false;
    }

    public p2b(ao8 ao8Var) {
        this.c = new int[2];
        this.b = ao8Var;
        this.a = null;
    }
}
