package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class l6b implements hcb {
    public final d79 a;
    public final mr8 b;
    public final int[] c;
    public final boolean d;
    public k6b e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public l6b(d79 d79Var, boolean z) {
        this.c = new int[2];
        this.a = d79Var;
        this.d = z;
        this.b = null;
    }

    public static l6b a(d79 d79Var) {
        return new l6b(d79Var, false);
    }

    public final void b(icb icbVar) {
        View view = icbVar.g;
        if (view == null) {
            return;
        }
        if (view instanceof j6b) {
            int[] iArr = this.c;
            ((j6b) view).b(iArr);
            icbVar.h = iArr[0];
            icbVar.i = iArr[1] - this.s;
        } else if (view instanceof sl0) {
            icbVar.h = ((sl0) view).f3;
            icbVar.i = (view.getMeasuredHeight() - icbVar.g.getPaddingBottom()) - this.s;
        } else {
            icbVar.h = view.getPaddingTop();
            icbVar.i = (icbVar.g.getMeasuredHeight() - icbVar.g.getPaddingBottom()) - this.s;
        }
    }

    @Override
    public final void f(boolean z) {
        k6b k6bVar = this.e;
        if (k6bVar != null) {
            k6bVar.f(z);
        }
    }

    @Override
    public final boolean j(long j, int i, int i2, int i3, icb icbVar) {
        pg3 pg3Var;
        ViewGroup viewGroup;
        boolean z;
        fcb fcbVar = null;
        icbVar.a = null;
        icbVar.b = null;
        icbVar.c = null;
        icbVar.e = null;
        d79 d79Var = this.a;
        if (d79Var != null && (d79Var.getParent() instanceof pg3)) {
            pg3Var = (pg3) d79Var.getParent();
        } else {
            pg3Var = null;
        }
        if (pg3Var != null && !pg3Var.g()) {
            viewGroup = pg3Var.r;
        } else {
            viewGroup = d79Var;
        }
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i4 = 0;
            while (i4 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof og3) {
                    og3 og3Var = (og3) childAt;
                    if (og3Var.F == j) {
                        icbVar.a = childAt;
                        icbVar.b = og3Var.r;
                        icbVar.m = og3Var.P;
                        icbVar.d = og3Var.S;
                        pg3 pg3Var2 = (pg3) og3Var.getParent().getParent();
                        icbVar.g = pg3Var2;
                        icbVar.i = 0.0f;
                        icbVar.h = 0.0f;
                        icbVar.k = 1.0f;
                        if (og3Var.H && pg3Var2.g()) {
                            icbVar.f = new hja(new Path(), (byte) 17);
                            return true;
                        }
                        icbVar.f = fcbVar;
                        return true;
                    }
                } else if (childAt instanceof of3) {
                    of3 of3Var = (of3) childAt;
                    ImageReceiver imageReceiver = of3Var.Z1;
                    gf3 gf3Var = of3Var.v0;
                    int i5 = (of3Var.getDialogId() > j ? 1 : (of3Var.getDialogId() == j ? 0 : -1));
                    boolean z2 = this.d;
                    if ((i5 == 0 && !z2) || (z2 && of3Var.W())) {
                        icbVar.a = childAt;
                        icbVar.m = gf3Var;
                        icbVar.b = imageReceiver;
                        icbVar.g = (View) of3Var.getParent();
                        if (z2) {
                            icbVar.l = imageReceiver;
                            boolean z3 = gf3Var.w;
                        }
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    if (wb2Var.getMessageObject().e1() == i) {
                        icbVar.a = childAt;
                        if (i3 != 1 && i3 != 2) {
                            icbVar.c = wb2Var.T7;
                        } else {
                            icbVar.c = wb2Var.getPhotoImage();
                        }
                        icbVar.g = (View) wb2Var.getParent();
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else if (childAt instanceof dl1) {
                    dl1 dl1Var = (dl1) childAt;
                    if (dl1Var.getMessageObject().e1() == i) {
                        icbVar.a = childAt;
                        if (dl1Var.getMessageObject().k.media.storyItem.noforwards) {
                            icbVar.b = dl1Var.getPhotoImage();
                        } else {
                            icbVar.c = dl1Var.getPhotoImage();
                        }
                        icbVar.g = (View) dl1Var.getParent();
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else if ((childAt instanceof jja) && d79Var != null) {
                    jja jjaVar = (jja) childAt;
                    r47 messageObject = jjaVar.getMessageObject();
                    if ((jjaVar.getStyle() == 1 && i2 == 0) || (messageObject != null && messageObject.w4() && messageObject.e1() == i2 && messageObject.l.dialogId == j)) {
                        k69 fastScroll = d79Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        icbVar.a = childAt;
                        icbVar.c = jjaVar.c;
                        icbVar.e = new o48(jjaVar, fastScroll, iArr, (byte) 15);
                        icbVar.g = (View) jjaVar.getParent();
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else if (childAt instanceof vac) {
                    vac vacVar = (vac) childAt;
                    if (vacVar.getDialogId() == j) {
                        mb0 mb0Var = vacVar.a;
                        icbVar.a = mb0Var;
                        icbVar.m = vacVar.U;
                        icbVar.b = mb0Var.getImageReceiver();
                        icbVar.g = (View) vacVar.getParent();
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else if (childAt instanceof e39) {
                    e39 e39Var = (e39) childAt;
                    de0 de0Var = e39Var.h;
                    if (e39Var.E != j) {
                        continue;
                    } else {
                        if (de0Var != null && de0Var.getImageReceiver() != null && de0Var.getImageReceiver().T != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (e39Var.n == i2 && z) {
                            icbVar.a = de0Var;
                            icbVar.c = de0Var.getImageReceiver();
                            icbVar.g = (View) e39Var.getParent();
                            float alphaInternal = e39Var.getAlphaInternal() * e39Var.getAlpha();
                            icbVar.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                icbVar.j = paint;
                                paint.setColor(aob.v0(aob.h5, e39Var.getResourcesProvider()));
                            }
                            b(icbVar);
                            return true;
                        } else if (!z) {
                            d39 d39Var = e39Var.c;
                            icbVar.a = d39Var;
                            icbVar.m = e39Var.F;
                            icbVar.b = d39Var.getImageReceiver();
                            icbVar.g = (View) e39Var.getParent();
                            float alphaInternal2 = e39Var.getAlphaInternal() * e39Var.getAlpha();
                            icbVar.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                icbVar.j = paint2;
                                paint2.setColor(aob.v0(aob.h5, e39Var.getResourcesProvider()));
                            }
                            b(icbVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof bv8) {
                    bv8 bv8Var = (bv8) childAt;
                    if (bv8Var.getDialogId() == j) {
                        icbVar.a = bv8Var;
                        icbVar.m = bv8Var.w0;
                        icbVar.b = bv8Var.r;
                        icbVar.g = (View) bv8Var.getParent();
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else if (childAt instanceof z1b) {
                    z1b z1bVar = (z1b) childAt;
                    if (z1bVar.getPostInfo().b() == i2) {
                        icbVar.a = z1bVar.getImageView();
                        icbVar.m = z1bVar.getStoryAvatarParams();
                        icbVar.c = z1bVar.getImageView().getImageReceiver();
                        icbVar.g = (View) z1bVar.getParent();
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else if (childAt instanceof lj6) {
                    lj6 lj6Var = (lj6) childAt;
                    if (lj6Var.getStoryItem() != null && lj6Var.getStoryItem().dialogId == j && lj6Var.getStoryItem().messageId == i) {
                        icbVar.a = lj6Var.getAvatarImageView();
                        icbVar.m = lj6Var.getStoryAvatarParams();
                        icbVar.b = lj6Var.getAvatarImageView().getImageReceiver();
                        icbVar.g = (View) lj6Var.getParent();
                        icbVar.k = 1.0f;
                        b(icbVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i4++;
                fcbVar = null;
            }
        }
        return false;
    }

    @Override
    public final void x(long j, int i, x58 x58Var) {
        ArrayList arrayList;
        int i2 = 0;
        d79 d79Var = this.a;
        if (d79Var != null) {
            if (d79Var.getParent() instanceof pg3) {
                pg3 pg3Var = (pg3) d79Var.getParent();
                if (pg3Var.k(j)) {
                    pg3Var.c0.add(x58Var);
                    return;
                } else {
                    x58Var.run();
                    return;
                }
            } else if (d79Var.getParent() instanceof z3a) {
                z3a z3aVar = (z3a) d79Var.getParent();
                td4 td4Var = z3aVar.y;
                v3a v3aVar = z3aVar.x;
                if (v3aVar != null && (arrayList = v3aVar.c) != null && td4Var != null) {
                    while (true) {
                        if (i2 < arrayList.size()) {
                            s3a s3aVar = (s3a) arrayList.get(i2);
                            if (s3aVar != null) {
                                TL_stories.StoryReaction storyReaction = s3aVar.c;
                                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                    TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                    if (tL_storyReactionPublicRepost.story != null && wf3.n(tL_storyReactionPublicRepost.peer_id) == j && tL_storyReactionPublicRepost.story.id == i) {
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
                        int K0 = td4Var.K0();
                        int M0 = td4Var.M0();
                        if (i2 < K0 || i2 > M0) {
                            td4Var.g1(i2, hl.L(60.0f));
                            d79Var.post(x58Var);
                            return;
                        }
                    }
                }
                x58Var.run();
                return;
            }
        }
        if (this.d) {
            c6b O1 = uc7.s1(yac.t0).O1();
            ArrayList arrayList2 = O1.h;
            O1.u(arrayList2);
            Collections.sort(arrayList2, O1.J);
            jn7.f(O1.a).k(jn7.y5, new Object[0]);
        }
        x58Var.run();
    }

    public l6b(mr8 mr8Var) {
        this.c = new int[2];
        this.b = mr8Var;
        this.a = null;
    }
}
