package ei;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.sv0;
public final class i7 implements n9 {
    public final tj0 f10415a;
    public final sv0 f10416b;
    public final int[] f10417c;
    public final boolean d;
    public h7 f10418e;
    public boolean f10419f;
    public boolean h;
    public boolean f10420n;
    public boolean f10421r;
    public int f10422s;

    public i7(tj0 tj0Var, boolean z10) {
        this.f10417c = new int[2];
        this.f10415a = tj0Var;
        this.d = z10;
        this.f10416b = null;
    }

    public static i7 a(tj0 tj0Var) {
        return new i7(tj0Var, false);
    }

    public final void b(o9 o9Var) {
        View view = o9Var.f10731g;
        if (view == null) {
            return;
        }
        if (view instanceof g7) {
            int[] iArr = this.f10417c;
            ((g7) view).a(iArr);
            o9Var.h = iArr[0];
            o9Var.f10732i = iArr[1] - this.f10422s;
        } else if (view instanceof org.telegram.ui.Components.w9) {
            o9Var.h = ((org.telegram.ui.Components.w9) view).f39971f3;
            o9Var.f10732i = (view.getMeasuredHeight() - o9Var.f10731g.getPaddingBottom()) - this.f10422s;
        } else {
            o9Var.h = view.getPaddingTop();
            o9Var.f10732i = (o9Var.f10731g.getMeasuredHeight() - o9Var.f10731g.getPaddingBottom()) - this.f10422s;
        }
    }

    @Override
    public final void c(boolean z10) {
        h7 h7Var = this.f10418e;
        if (h7Var != null) {
            h7Var.c(z10);
        }
    }

    @Override
    public final boolean j(long j10, int i3, int i10, int i11, o9 o9Var) {
        r rVar;
        ViewGroup viewGroup;
        boolean z10;
        l9 l9Var = null;
        o9Var.f10726a = null;
        o9Var.f10727b = null;
        o9Var.f10728c = null;
        o9Var.f10729e = null;
        tj0 tj0Var = this.f10415a;
        if (tj0Var != null && (tj0Var.getParent() instanceof r)) {
            rVar = (r) tj0Var.getParent();
        } else {
            rVar = null;
        }
        if (rVar != null && !rVar.g()) {
            viewGroup = rVar.f10844r;
        } else {
            viewGroup = tj0Var;
        }
        ViewGroup viewGroup2 = this.f10416b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i12 = 0;
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    if (qVar.F == j10) {
                        o9Var.f10726a = childAt;
                        o9Var.f10727b = qVar.f10789r;
                        o9Var.f10736m = qVar.P;
                        o9Var.d = qVar.S;
                        r rVar2 = (r) qVar.getParent().getParent();
                        o9Var.f10731g = rVar2;
                        o9Var.f10732i = 0.0f;
                        o9Var.h = 0.0f;
                        o9Var.f10734k = 1.0f;
                        if (qVar.H && rVar2.g()) {
                            o9Var.f10730f = new a1.c(new Path(), 27);
                            return true;
                        }
                        o9Var.f10730f = l9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Z1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.f30569v0;
                    int i13 = (t2Var.getDialogId() > j10 ? 1 : (t2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i13 == 0 && !z11) || (z11 && t2Var.U())) {
                        o9Var.f10726a = childAt;
                        o9Var.f10736m = m2Var;
                        o9Var.f10727b = imageReceiver;
                        o9Var.f10731g = (View) t2Var.getParent();
                        if (z11) {
                            o9Var.f10735l = imageReceiver;
                            boolean z12 = m2Var.f10715w;
                        }
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().f1() == i3) {
                        o9Var.f10726a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            o9Var.f10728c = q1Var.S7;
                        } else {
                            o9Var.f10728c = q1Var.getPhotoImage();
                        }
                        o9Var.f10731g = (View) q1Var.getParent();
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().f1() == i3) {
                        o9Var.f10726a = childAt;
                        if (t0Var.getMessageObject().f26868k.media.storyItem.noforwards) {
                            o9Var.f10727b = t0Var.getPhotoImage();
                        } else {
                            o9Var.f10728c = t0Var.getPhotoImage();
                        }
                        o9Var.f10731g = (View) t0Var.getParent();
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.n7) && tj0Var != null) {
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                    zi messageObject = n7Var.getMessageObject();
                    if ((n7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.y4() && messageObject.f1() == i10 && messageObject.f26871l.dialogId == j10)) {
                        yi0 fastScroll = tj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        o9Var.f10726a = childAt;
                        o9Var.f10728c = n7Var.f29683c;
                        o9Var.f10729e = new aa.a(n7Var, fastScroll, iArr, 5);
                        o9Var.f10731g = (View) n7Var.getParent();
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j10) {
                        d4 d4Var = paVar.f29822a;
                        o9Var.f10726a = d4Var;
                        o9Var.f10736m = paVar.U;
                        o9Var.f10727b = d4Var.getImageReceiver();
                        o9Var.f10731g = (View) paVar.getParent();
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l6) {
                    org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                    org.telegram.ui.Components.k9 k9Var = l6Var.h;
                    if (l6Var.E != j10) {
                        continue;
                    } else {
                        if (k9Var != null && k9Var.getImageReceiver() != null && k9Var.getImageReceiver().T != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (l6Var.f29579n == i10 && z10) {
                            o9Var.f10726a = k9Var;
                            o9Var.f10728c = k9Var.getImageReceiver();
                            o9Var.f10731g = (View) l6Var.getParent();
                            float alphaInternal = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            o9Var.f10734k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                o9Var.f10733j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, l6Var.getResourcesProvider()));
                            }
                            b(o9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.k6 k6Var = l6Var.f29576c;
                            o9Var.f10726a = k6Var;
                            o9Var.f10736m = l6Var.F;
                            o9Var.f10727b = k6Var.getImageReceiver();
                            o9Var.f10731g = (View) l6Var.getParent();
                            float alphaInternal2 = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            o9Var.f10734k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                o9Var.f10733j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, l6Var.getResourcesProvider()));
                            }
                            b(o9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (f6Var.getDialogId() == j10) {
                        o9Var.f10726a = f6Var;
                        o9Var.f10736m = f6Var.f29204v0;
                        o9Var.f10727b = f6Var.f29198r;
                        o9Var.f10731g = (View) f6Var.getParent();
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v7) {
                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                    if (v7Var.getPostInfo().b() == i10) {
                        o9Var.f10726a = v7Var.getImageView();
                        o9Var.f10736m = v7Var.getStoryAvatarParams();
                        o9Var.f10728c = v7Var.getImageView().getImageReceiver();
                        o9Var.f10731g = (View) v7Var.getParent();
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i3) {
                        o9Var.f10726a = a5Var.getAvatarImageView();
                        o9Var.f10736m = a5Var.getStoryAvatarParams();
                        o9Var.f10727b = a5Var.getAvatarImageView().getImageReceiver();
                        o9Var.f10731g = (View) a5Var.getParent();
                        o9Var.f10734k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                l9Var = null;
            }
        }
        return false;
    }

    @Override
    public final void r(long j10, int i3, o3 o3Var) {
        ArrayList arrayList;
        tj0 tj0Var = this.f10415a;
        if (tj0Var != null && (tj0Var.getParent() instanceof r)) {
            r rVar = (r) tj0Var.getParent();
            if (rVar.k(j10)) {
                rVar.f10827c0.add(o3Var);
                return;
            } else {
                o3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (tj0Var != null && (tj0Var.getParent() instanceof k5)) {
            k5 k5Var = (k5) tj0Var.getParent();
            jy jyVar = k5Var.f10581y;
            g5 g5Var = k5Var.f10580x;
            if (g5Var != null && (arrayList = g5Var.f10333c) != null && jyVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        b5 b5Var = (b5) arrayList.get(i10);
                        if (b5Var != null) {
                            TL_stories.StoryReaction storyReaction = b5Var.f10129c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f27240id == i3) {
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
                    int L0 = jyVar.L0();
                    int N0 = jyVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        jyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                        tj0Var.post(o3Var);
                        return;
                    }
                }
            }
            o3Var.run();
            return;
        }
        if (this.d) {
            z6 P1 = hp.s1(h10.f22829t0).P1();
            ArrayList arrayList2 = P1.h;
            P1.v(arrayList2);
            Collections.sort(arrayList2, P1.J);
            hs.f(P1.f11274a).k(hs.f23324v5, new Object[0]);
        }
        o3Var.run();
    }

    public i7(sv0 sv0Var) {
        this.f10417c = new int[2];
        this.f10416b = sv0Var;
        this.f10415a = null;
    }
}
