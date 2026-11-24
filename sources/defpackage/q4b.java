package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class q4b implements kab {
    public final r59 a;
    public final bq8 b;
    public final int[] c;
    public final boolean d;
    public p4b e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public q4b(r59 r59Var, boolean z) {
        this.c = new int[2];
        this.a = r59Var;
        this.d = z;
        this.b = null;
    }

    public static q4b a(r59 r59Var) {
        return new q4b(r59Var, false);
    }

    public final void b(lab labVar) {
        View view = labVar.g;
        if (view == null) {
            return;
        }
        if (view instanceof o4b) {
            int[] iArr = this.c;
            ((o4b) view).b(iArr);
            labVar.h = iArr[0];
            labVar.i = iArr[1] - this.s;
        } else if (view instanceof rm0) {
            labVar.h = ((rm0) view).f3;
            labVar.i = (view.getMeasuredHeight() - labVar.g.getPaddingBottom()) - this.s;
        } else {
            labVar.h = view.getPaddingTop();
            labVar.i = (labVar.g.getMeasuredHeight() - labVar.g.getPaddingBottom()) - this.s;
        }
    }

    @Override
    public final void e(boolean z) {
        p4b p4bVar = this.e;
        if (p4bVar != null) {
            p4bVar.e(z);
        }
    }

    @Override
    public final boolean h(long j, int i, int i2, int i3, lab labVar) {
        ih3 ih3Var;
        ViewGroup viewGroup;
        boolean z;
        iab iabVar = null;
        labVar.a = null;
        labVar.b = null;
        labVar.c = null;
        labVar.e = null;
        r59 r59Var = this.a;
        if (r59Var != null && (r59Var.getParent() instanceof ih3)) {
            ih3Var = (ih3) r59Var.getParent();
        } else {
            ih3Var = null;
        }
        if (ih3Var != null && !ih3Var.g()) {
            viewGroup = ih3Var.r;
        } else {
            viewGroup = r59Var;
        }
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i4 = 0;
            while (i4 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof hh3) {
                    hh3 hh3Var = (hh3) childAt;
                    if (hh3Var.F == j) {
                        labVar.a = childAt;
                        labVar.b = hh3Var.r;
                        labVar.m = hh3Var.P;
                        labVar.d = hh3Var.S;
                        ih3 ih3Var2 = (ih3) hh3Var.getParent().getParent();
                        labVar.g = ih3Var2;
                        labVar.i = 0.0f;
                        labVar.h = 0.0f;
                        labVar.k = 1.0f;
                        if (hh3Var.H && ih3Var2.g()) {
                            labVar.f = new wta(new Path(), (byte) 8);
                            return true;
                        }
                        labVar.f = iabVar;
                        return true;
                    }
                } else if (childAt instanceof hg3) {
                    hg3 hg3Var = (hg3) childAt;
                    ImageReceiver imageReceiver = hg3Var.Z1;
                    zf3 zf3Var = hg3Var.v0;
                    int i5 = (hg3Var.getDialogId() > j ? 1 : (hg3Var.getDialogId() == j ? 0 : -1));
                    boolean z2 = this.d;
                    if ((i5 == 0 && !z2) || (z2 && hg3Var.U())) {
                        labVar.a = childAt;
                        labVar.m = zf3Var;
                        labVar.b = imageReceiver;
                        labVar.g = (View) hg3Var.getParent();
                        if (z2) {
                            labVar.l = imageReceiver;
                            boolean z3 = zf3Var.w;
                        }
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    if (rc2Var.getMessageObject().e1() == i) {
                        labVar.a = childAt;
                        if (i3 != 1 && i3 != 2) {
                            labVar.c = rc2Var.T7;
                        } else {
                            labVar.c = rc2Var.getPhotoImage();
                        }
                        labVar.g = (View) rc2Var.getParent();
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else if (childAt instanceof cm1) {
                    cm1 cm1Var = (cm1) childAt;
                    if (cm1Var.getMessageObject().e1() == i) {
                        labVar.a = childAt;
                        if (cm1Var.getMessageObject().k.media.storyItem.noforwards) {
                            labVar.b = cm1Var.getPhotoImage();
                        } else {
                            labVar.c = cm1Var.getPhotoImage();
                        }
                        labVar.g = (View) cm1Var.getParent();
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else if ((childAt instanceof sha) && r59Var != null) {
                    sha shaVar = (sha) childAt;
                    k47 messageObject = shaVar.getMessageObject();
                    if ((shaVar.getStyle() == 1 && i2 == 0) || (messageObject != null && messageObject.w4() && messageObject.e1() == i2 && messageObject.l.dialogId == j)) {
                        y49 fastScroll = r59Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        labVar.a = childAt;
                        labVar.c = shaVar.c;
                        labVar.e = new jq9(shaVar, fastScroll, iArr, (byte) 6);
                        labVar.g = (View) shaVar.getParent();
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else if (childAt instanceof w8c) {
                    w8c w8cVar = (w8c) childAt;
                    if (w8cVar.getDialogId() == j) {
                        kc0 kc0Var = w8cVar.a;
                        labVar.a = kc0Var;
                        labVar.m = w8cVar.U;
                        labVar.b = kc0Var.getImageReceiver();
                        labVar.g = (View) w8cVar.getParent();
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else if (childAt instanceof r19) {
                    r19 r19Var = (r19) childAt;
                    bf0 bf0Var = r19Var.h;
                    if (r19Var.E != j) {
                        continue;
                    } else {
                        if (bf0Var != null && bf0Var.getImageReceiver() != null && bf0Var.getImageReceiver().T != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (r19Var.n == i2 && z) {
                            labVar.a = bf0Var;
                            labVar.c = bf0Var.getImageReceiver();
                            labVar.g = (View) r19Var.getParent();
                            float alphaInternal = r19Var.getAlphaInternal() * r19Var.getAlpha();
                            labVar.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                labVar.j = paint;
                                paint.setColor(cmb.v0(cmb.g5, r19Var.getResourcesProvider()));
                            }
                            b(labVar);
                            return true;
                        } else if (!z) {
                            q19 q19Var = r19Var.c;
                            labVar.a = q19Var;
                            labVar.m = r19Var.F;
                            labVar.b = q19Var.getImageReceiver();
                            labVar.g = (View) r19Var.getParent();
                            float alphaInternal2 = r19Var.getAlphaInternal() * r19Var.getAlpha();
                            labVar.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                labVar.j = paint2;
                                paint2.setColor(cmb.v0(cmb.g5, r19Var.getResourcesProvider()));
                            }
                            b(labVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof ut8) {
                    ut8 ut8Var = (ut8) childAt;
                    if (ut8Var.getDialogId() == j) {
                        labVar.a = ut8Var;
                        labVar.m = ut8Var.v0;
                        labVar.b = ut8Var.r;
                        labVar.g = (View) ut8Var.getParent();
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else if (childAt instanceof a0b) {
                    a0b a0bVar = (a0b) childAt;
                    if (a0bVar.getPostInfo().b() == i2) {
                        labVar.a = a0bVar.getImageView();
                        labVar.m = a0bVar.getStoryAvatarParams();
                        labVar.c = a0bVar.getImageView().getImageReceiver();
                        labVar.g = (View) a0bVar.getParent();
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else if (childAt instanceof ij6) {
                    ij6 ij6Var = (ij6) childAt;
                    if (ij6Var.getStoryItem() != null && ij6Var.getStoryItem().dialogId == j && ij6Var.getStoryItem().messageId == i) {
                        labVar.a = ij6Var.getAvatarImageView();
                        labVar.m = ij6Var.getStoryAvatarParams();
                        labVar.b = ij6Var.getAvatarImageView().getImageReceiver();
                        labVar.g = (View) ij6Var.getParent();
                        labVar.k = 1.0f;
                        b(labVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i4++;
                iabVar = null;
            }
        }
        return false;
    }

    @Override
    public final void q0(long j, int i, j48 j48Var) {
        ArrayList arrayList;
        int i2 = 0;
        r59 r59Var = this.a;
        if (r59Var != null) {
            if (r59Var.getParent() instanceof ih3) {
                ih3 ih3Var = (ih3) r59Var.getParent();
                if (ih3Var.k(j)) {
                    ih3Var.c0.add(j48Var);
                    return;
                } else {
                    j48Var.run();
                    return;
                }
            } else if (r59Var.getParent() instanceof i2a) {
                i2a i2aVar = (i2a) r59Var.getParent();
                wd4 wd4Var = i2aVar.y;
                e2a e2aVar = i2aVar.x;
                if (e2aVar != null && (arrayList = e2aVar.c) != null && wd4Var != null) {
                    while (true) {
                        if (i2 < arrayList.size()) {
                            a2a a2aVar = (a2a) arrayList.get(i2);
                            if (a2aVar != null) {
                                TL_stories.StoryReaction storyReaction = a2aVar.c;
                                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                    TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                    if (tL_storyReactionPublicRepost.story != null && pg3.n(tL_storyReactionPublicRepost.peer_id) == j && tL_storyReactionPublicRepost.story.id == i) {
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
                        int K0 = wd4Var.K0();
                        int M0 = wd4Var.M0();
                        if (i2 < K0 || i2 > M0) {
                            wd4Var.g1(i2, gm.L(60.0f));
                            r59Var.post(j48Var);
                            return;
                        }
                    }
                }
                j48Var.run();
                return;
            }
        }
        if (this.d) {
            h4b N1 = oc7.r1(z8c.t0).N1();
            ArrayList arrayList2 = N1.h;
            N1.u(arrayList2);
            Collections.sort(arrayList2, N1.J);
            nm7.f(N1.a).k(nm7.z5, new Object[0]);
        }
        j48Var.run();
    }

    public q4b(bq8 bq8Var) {
        this.c = new int[2];
        this.b = bq8Var;
        this.a = null;
    }
}
