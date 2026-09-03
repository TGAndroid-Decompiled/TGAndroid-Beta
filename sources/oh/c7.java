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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.e01;
public final class c7 implements e9 {
    public final sl0 f16943a;
    public final e01 f16944b;
    public final int[] f16945c;
    public final boolean d;
    public b7 f16946e;
    public boolean f16947f;
    public boolean h;
    public boolean f16948n;
    public boolean f16949r;
    public int f16950s;

    public c7(sl0 sl0Var, boolean z4) {
        this.f16945c = new int[2];
        this.f16943a = sl0Var;
        this.d = z4;
        this.f16944b = null;
    }

    public static c7 a(sl0 sl0Var) {
        return new c7(sl0Var, false);
    }

    @Override
    public final void b(boolean z4) {
        b7 b7Var = this.f16946e;
        if (b7Var != null) {
            b7Var.b(z4);
        }
    }

    @Override
    public final void b0(long j10, int i10, l3 l3Var) {
        ArrayList arrayList;
        sl0 sl0Var = this.f16943a;
        if (sl0Var != null && (sl0Var.getParent() instanceof p)) {
            p pVar = (p) sl0Var.getParent();
            if (pVar.k(j10)) {
                pVar.V.add(l3Var);
                return;
            } else {
                l3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (sl0Var != null && (sl0Var.getParent() instanceof e5)) {
            e5 e5Var = (e5) sl0Var.getParent();
            rz rzVar = e5Var.f17036x;
            a5 a5Var = e5Var.f17035w;
            if (a5Var != null && (arrayList = a5Var.f16844c) != null && rzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        v4 v4Var = (v4) arrayList.get(i11);
                        if (v4Var != null) {
                            TL_stories.StoryReaction storyReaction = v4Var.f17851c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f21082id == i10) {
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
                        sl0Var.post(l3Var);
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
            NotificationCenter.getInstance(storiesController.f17772a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        l3Var.run();
    }

    public final void c(f9 f9Var) {
        View view = f9Var.f17151g;
        if (view == null) {
            return;
        }
        if (view instanceof a7) {
            int[] iArr = this.f16945c;
            ((a7) view).a(iArr);
            f9Var.h = iArr[0];
            f9Var.f17152i = iArr[1] - this.f16950s;
        } else if (view instanceof aa) {
            f9Var.h = ((aa) view).U2;
            f9Var.f17152i = (view.getMeasuredHeight() - f9Var.f17151g.getPaddingBottom()) - this.f16950s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.f17152i = (f9Var.f17151g.getMeasuredHeight() - f9Var.f17151g.getPaddingBottom()) - this.f16950s;
        }
    }

    @Override
    public final boolean k1(long j10, int i10, int i11, int i12, f9 f9Var) {
        p pVar;
        ViewGroup viewGroup;
        boolean z4;
        c9 c9Var = null;
        f9Var.f17146a = null;
        f9Var.f17147b = null;
        f9Var.f17148c = null;
        f9Var.f17149e = null;
        sl0 sl0Var = this.f16943a;
        if (sl0Var != null && (sl0Var.getParent() instanceof p)) {
            pVar = (p) sl0Var.getParent();
        } else {
            pVar = null;
        }
        if (pVar != null && !pVar.g()) {
            viewGroup = pVar.f17598r;
        } else {
            viewGroup = sl0Var;
        }
        ViewGroup viewGroup2 = this.f16944b;
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
                        f9Var.f17146a = childAt;
                        f9Var.f17147b = oVar.f17524r;
                        f9Var.f17156m = oVar.L;
                        f9Var.d = oVar.O;
                        p pVar2 = (p) oVar.getParent().getParent();
                        f9Var.f17151g = pVar2;
                        f9Var.f17152i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.f17154k = 1.0f;
                        if (oVar.D && pVar2.g()) {
                            f9Var.f17150f = new mh.m5(new Path(), 11);
                            return true;
                        }
                        f9Var.f17150f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.V1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.f23497r0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && r2Var.O())) {
                        f9Var.f17146a = childAt;
                        f9Var.f17156m = j2Var;
                        f9Var.f17147b = imageReceiver;
                        f9Var.f17151g = (View) r2Var.getParent();
                        if (z10) {
                            f9Var.f17155l = imageReceiver;
                            boolean z11 = j2Var.f17244w;
                        }
                        f9Var.f17154k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        f9Var.f17146a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            f9Var.f17148c = t1Var.C9;
                        } else {
                            f9Var.f17148c = t1Var.getPhotoImage();
                        }
                        f9Var.f17151g = (View) t1Var.getParent();
                        f9Var.f17154k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        f9Var.f17146a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            f9Var.f17147b = v0Var.getPhotoImage();
                        } else {
                            f9Var.f17148c = v0Var.getPhotoImage();
                        }
                        f9Var.f17151g = (View) v0Var.getParent();
                        f9Var.f17154k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.r7) && sl0Var != null) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    MessageObject messageObject = r7Var.getMessageObject();
                    if ((r7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        bl0 fastScroll = sl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.f17146a = childAt;
                        f9Var.f17148c = r7Var.f23563c;
                        f9Var.f17149e = new androidx.car.app.utils.a(r7Var, fastScroll, iArr, 10);
                        f9Var.f17151g = (View) r7Var.getParent();
                        f9Var.f17154k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        a4 a4Var = vaVar.f24325a;
                        f9Var.f17146a = a4Var;
                        f9Var.f17156m = vaVar.Q;
                        f9Var.f17147b = a4Var.getImageReceiver();
                        f9Var.f17151g = (View) vaVar.getParent();
                        f9Var.f17154k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.p9 p9Var = n6Var.h;
                    if (n6Var.f23231x != j10) {
                        continue;
                    } else {
                        if (p9Var != null && p9Var.getImageReceiver() != null && p9Var.getImageReceiver().getImageDrawable() != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (n6Var.f23227n == i11 && z4) {
                            f9Var.f17146a = p9Var;
                            f9Var.f17148c = p9Var.getImageReceiver();
                            f9Var.f17151g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.f17154k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.f17153j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        } else if (!z4) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f23224c;
                            f9Var.f17146a = m6Var;
                            f9Var.f17156m = n6Var.f23232y;
                            f9Var.f17147b = m6Var.getImageReceiver();
                            f9Var.f17151g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.f17154k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.f17153j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        f9Var.f17146a = h6Var;
                        f9Var.f17156m = h6Var.f22912r0;
                        f9Var.f17147b = h6Var.f22911r;
                        f9Var.f17151g = (View) h6Var.getParent();
                        f9Var.f17154k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) childAt;
                    if (a8Var.getPostInfo().b() == i11) {
                        f9Var.f17146a = a8Var.getImageView();
                        f9Var.f17156m = a8Var.getStoryAvatarParams();
                        f9Var.f17148c = a8Var.getImageView().getImageReceiver();
                        f9Var.f17151g = (View) a8Var.getParent();
                        f9Var.f17154k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j10 && b5Var.getStoryItem().messageId == i10) {
                        f9Var.f17146a = b5Var.getAvatarImageView();
                        f9Var.f17156m = b5Var.getStoryAvatarParams();
                        f9Var.f17147b = b5Var.getAvatarImageView().getImageReceiver();
                        f9Var.f17151g = (View) b5Var.getParent();
                        f9Var.f17154k = 1.0f;
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

    public c7(e01 e01Var) {
        this.f16945c = new int[2];
        this.f16944b = e01Var;
        this.f16943a = null;
    }
}
