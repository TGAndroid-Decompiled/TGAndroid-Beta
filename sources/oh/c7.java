package oh;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.zz0;
public final class c7 implements e9 {
    public final tl0 f16941a;
    public final zz0 f16942b;
    public final int[] f16943c;
    public final boolean d;
    public b7 f16944e;
    public boolean f16945f;
    public boolean h;
    public boolean f16946n;
    public boolean f16947r;
    public int f16948s;

    public c7(tl0 tl0Var, boolean z4) {
        this.f16943c = new int[2];
        this.f16941a = tl0Var;
        this.d = z4;
        this.f16942b = null;
    }

    public static c7 a(tl0 tl0Var) {
        return new c7(tl0Var, false);
    }

    @Override
    public final void b(boolean z4) {
        b7 b7Var = this.f16944e;
        if (b7Var != null) {
            b7Var.b(z4);
        }
    }

    @Override
    public final void b0(long j10, int i10, l3 l3Var) {
        ArrayList arrayList;
        tl0 tl0Var = this.f16941a;
        if (tl0Var != null && (tl0Var.getParent() instanceof p)) {
            p pVar = (p) tl0Var.getParent();
            if (pVar.k(j10)) {
                pVar.V.add(l3Var);
                return;
            } else {
                l3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (tl0Var != null && (tl0Var.getParent() instanceof e5)) {
            e5 e5Var = (e5) tl0Var.getParent();
            rz rzVar = e5Var.f17034x;
            a5 a5Var = e5Var.f17033w;
            if (a5Var != null && (arrayList = a5Var.f16842c) != null && rzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        v4 v4Var = (v4) arrayList.get(i11);
                        if (v4Var != null) {
                            TL_stories.StoryReaction storyReaction = v4Var.f17849c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f21080id == i10) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    int L0 = rzVar.L0();
                    int N0 = rzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        rzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        tl0Var.post(l3Var);
                        return;
                    }
                }
            }
            l3Var.run();
            return;
        }
        if (this.d) {
            t6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f17770a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        l3Var.run();
    }

    public final void c(f9 f9Var) {
        View view = f9Var.f17149g;
        if (view == null) {
            return;
        }
        if (view instanceof a7) {
            int[] iArr = this.f16943c;
            ((a7) view).a(iArr);
            f9Var.h = iArr[0];
            f9Var.f17150i = iArr[1] - this.f16948s;
        } else if (view instanceof aa) {
            f9Var.h = ((aa) view).U2;
            f9Var.f17150i = (view.getMeasuredHeight() - f9Var.f17149g.getPaddingBottom()) - this.f16948s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.f17150i = (f9Var.f17149g.getMeasuredHeight() - f9Var.f17149g.getPaddingBottom()) - this.f16948s;
        }
    }

    @Override
    public final boolean k1(long j10, int i10, int i11, int i12, f9 f9Var) {
        p pVar;
        ViewGroup viewGroup;
        boolean z4;
        c9 c9Var = null;
        f9Var.f17144a = null;
        f9Var.f17145b = null;
        f9Var.f17146c = null;
        f9Var.f17147e = null;
        tl0 tl0Var = this.f16941a;
        if (tl0Var != null && (tl0Var.getParent() instanceof p)) {
            pVar = (p) tl0Var.getParent();
        } else {
            pVar = null;
        }
        if (pVar != null && !pVar.g()) {
            viewGroup = pVar.f17596r;
        } else {
            viewGroup = tl0Var;
        }
        ViewGroup viewGroup2 = this.f16942b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof o) {
                    o oVar = (o) childAt;
                    if (oVar.B == j10) {
                        f9Var.f17144a = childAt;
                        f9Var.f17145b = oVar.f17522r;
                        f9Var.f17154m = oVar.L;
                        f9Var.d = oVar.O;
                        p pVar2 = (p) oVar.getParent().getParent();
                        f9Var.f17149g = pVar2;
                        f9Var.f17150i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.f17152k = 1.0f;
                        if (oVar.D && pVar2.g()) {
                            f9Var.f17148f = new mh.m5(new Path(), 11);
                            return true;
                        }
                        f9Var.f17148f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.V1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.f23495r0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && r2Var.O())) {
                        f9Var.f17144a = childAt;
                        f9Var.f17154m = j2Var;
                        f9Var.f17145b = imageReceiver;
                        f9Var.f17149g = (View) r2Var.getParent();
                        if (z10) {
                            f9Var.f17153l = imageReceiver;
                            boolean z11 = j2Var.f17242w;
                        }
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        f9Var.f17144a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            f9Var.f17146c = t1Var.C9;
                        } else {
                            f9Var.f17146c = t1Var.getPhotoImage();
                        }
                        f9Var.f17149g = (View) t1Var.getParent();
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        f9Var.f17144a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            f9Var.f17145b = v0Var.getPhotoImage();
                        } else {
                            f9Var.f17146c = v0Var.getPhotoImage();
                        }
                        f9Var.f17149g = (View) v0Var.getParent();
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.r7) && tl0Var != null) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    MessageObject messageObject = r7Var.getMessageObject();
                    if ((r7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        cl0 fastScroll = tl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.f17144a = childAt;
                        f9Var.f17146c = r7Var.f23561c;
                        f9Var.f17147e = new androidx.car.app.utils.a(r7Var, fastScroll, iArr, 10);
                        f9Var.f17149g = (View) r7Var.getParent();
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        a4 a4Var = vaVar.f24323a;
                        f9Var.f17144a = a4Var;
                        f9Var.f17154m = vaVar.Q;
                        f9Var.f17145b = a4Var.getImageReceiver();
                        f9Var.f17149g = (View) vaVar.getParent();
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.p9 p9Var = n6Var.h;
                    if (n6Var.f23229x != j10) {
                        continue;
                    } else {
                        if (p9Var != null && p9Var.getImageReceiver() != null && p9Var.getImageReceiver().getImageDrawable() != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (n6Var.f23225n == i11 && z4) {
                            f9Var.f17144a = p9Var;
                            f9Var.f17146c = p9Var.getImageReceiver();
                            f9Var.f17149g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.f17152k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.f17151j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        } else if (!z4) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f23222c;
                            f9Var.f17144a = m6Var;
                            f9Var.f17154m = n6Var.f23230y;
                            f9Var.f17145b = m6Var.getImageReceiver();
                            f9Var.f17149g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.f17152k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.f17151j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        f9Var.f17144a = h6Var;
                        f9Var.f17154m = h6Var.f22910r0;
                        f9Var.f17145b = h6Var.f22909r;
                        f9Var.f17149g = (View) h6Var.getParent();
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) childAt;
                    if (a8Var.getPostInfo().b() == i11) {
                        f9Var.f17144a = a8Var.getImageView();
                        f9Var.f17154m = a8Var.getStoryAvatarParams();
                        f9Var.f17146c = a8Var.getImageView().getImageReceiver();
                        f9Var.f17149g = (View) a8Var.getParent();
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j10 && b5Var.getStoryItem().messageId == i10) {
                        f9Var.f17144a = b5Var.getAvatarImageView();
                        f9Var.f17154m = b5Var.getStoryAvatarParams();
                        f9Var.f17145b = b5Var.getAvatarImageView().getImageReceiver();
                        f9Var.f17149g = (View) b5Var.getParent();
                        f9Var.f17152k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                c9Var = null;
            }
        }
        return false;
    }

    public c7(zz0 zz0Var) {
        this.f16943c = new int[2];
        this.f16942b = zz0Var;
        this.f16941a = null;
    }
}
