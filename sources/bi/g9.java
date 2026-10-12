package bi;

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
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.w01;
public final class g9 implements ob {
    public final mm0 f3081a;
    public final w01 f3082b;
    public final int[] f3083c;
    public final boolean d;
    public f9 e;
    public boolean f3084f;
    public boolean h;
    public boolean f3085n;
    public boolean f3086r;
    public int f3087s;

    public g9(mm0 mm0Var, boolean z10) {
        this.f3083c = new int[2];
        this.f3081a = mm0Var;
        this.d = z10;
        this.f3082b = null;
    }

    public static g9 a(mm0 mm0Var) {
        return new g9(mm0Var, false);
    }

    @Override
    public final boolean H0(long j10, int i10, int i11, int i12, pb pbVar) {
        v vVar;
        ViewGroup viewGroup;
        boolean z10;
        mb mbVar = null;
        pbVar.f3480a = null;
        pbVar.f3481b = null;
        pbVar.f3482c = null;
        pbVar.e = null;
        mm0 mm0Var = this.f3081a;
        if (mm0Var != null && (mm0Var.getParent() instanceof v)) {
            vVar = (v) mm0Var.getParent();
        } else {
            vVar = null;
        }
        if (vVar != null && !vVar.g()) {
            viewGroup = vVar.f3832r;
        } else {
            viewGroup = mm0Var;
        }
        ViewGroup viewGroup2 = this.f3082b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof u) {
                    u uVar = (u) childAt;
                    if (uVar.E == j10) {
                        pbVar.f3480a = childAt;
                        pbVar.f3481b = uVar.f3765r;
                        pbVar.f3489m = uVar.O;
                        pbVar.d = uVar.R;
                        v vVar2 = (v) uVar.getParent().getParent();
                        pbVar.f3484g = vVar2;
                        pbVar.f3485i = 0.0f;
                        pbVar.h = 0.0f;
                        pbVar.f3487k = 1.0f;
                        if (uVar.G && vVar2.g()) {
                            pbVar.f3483f = new a1.c(new Path(), 8);
                            return true;
                        }
                        pbVar.f3483f = mbVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.f21903u0;
                    int i14 = (s2Var.getDialogId() > j10 ? 1 : (s2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && s2Var.O())) {
                        pbVar.f3480a = childAt;
                        pbVar.f3489m = k2Var;
                        pbVar.f3481b = imageReceiver;
                        pbVar.f3484g = (View) s2Var.getParent();
                        if (z11) {
                            pbVar.f3488l = imageReceiver;
                            boolean z12 = k2Var.f3342w;
                        }
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        pbVar.f3480a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            pbVar.f3482c = u1Var.F9;
                        } else {
                            pbVar.f3482c = u1Var.getPhotoImage();
                        }
                        pbVar.f3484g = (View) u1Var.getParent();
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                    org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) childAt;
                    if (x0Var.getMessageObject().getId() == i10) {
                        pbVar.f3480a = childAt;
                        if (x0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            pbVar.f3481b = x0Var.getPhotoImage();
                        } else {
                            pbVar.f3482c = x0Var.getPhotoImage();
                        }
                        pbVar.f3484g = (View) x0Var.getParent();
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && mm0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        tl0 fastScroll = mm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        pbVar.f3480a = childAt;
                        pbVar.f3482c = t7Var.f22101c;
                        pbVar.e = new androidx.car.app.utils.a(t7Var, fastScroll, iArr, 3);
                        pbVar.f3484g = (View) t7Var.getParent();
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                    org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) childAt;
                    if (xaVar.getDialogId() == j10) {
                        k5 k5Var = xaVar.f22750a;
                        pbVar.f3480a = k5Var;
                        pbVar.f3489m = xaVar.T;
                        pbVar.f3481b = k5Var.getImageReceiver();
                        pbVar.f3484g = (View) xaVar.getParent();
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.z9 z9Var = o6Var.h;
                    if (o6Var.f21629y != j10) {
                        continue;
                    } else {
                        if (z9Var != null && z9Var.getImageReceiver() != null && z9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o6Var.f21624n == i11 && z10) {
                            pbVar.f3480a = z9Var;
                            pbVar.f3482c = z9Var.getImageReceiver();
                            pbVar.f3484g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            pbVar.f3487k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                pbVar.f3486j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, o6Var.getResourcesProvider()));
                            }
                            c(pbVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.f21622c;
                            pbVar.f3480a = n6Var;
                            pbVar.f3489m = o6Var.E;
                            pbVar.f3481b = n6Var.getImageReceiver();
                            pbVar.f3484g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            pbVar.f3487k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                pbVar.f3486j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, o6Var.getResourcesProvider()));
                            }
                            c(pbVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j10) {
                        pbVar.f3480a = i6Var;
                        pbVar.f3489m = i6Var.f21338u0;
                        pbVar.f3481b = i6Var.f21333r;
                        pbVar.f3484g = (View) i6Var.getParent();
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        pbVar.f3480a = c8Var.getImageView();
                        pbVar.f3489m = c8Var.getStoryAvatarParams();
                        pbVar.f3482c = c8Var.getImageView().getImageReceiver();
                        pbVar.f3484g = (View) c8Var.getParent();
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j10 && b5Var.getStoryItem().messageId == i10) {
                        pbVar.f3480a = b5Var.getAvatarImageView();
                        pbVar.f3489m = b5Var.getStoryAvatarParams();
                        pbVar.f3481b = b5Var.getAvatarImageView().getImageReceiver();
                        pbVar.f3484g = (View) b5Var.getParent();
                        pbVar.f3487k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                mbVar = null;
            }
        }
        return false;
    }

    @Override
    public final void b(boolean z10) {
        f9 f9Var = this.e;
        if (f9Var != null) {
            f9Var.b(z10);
        }
    }

    public final void c(pb pbVar) {
        View view = pbVar.f3484g;
        if (view == null) {
            return;
        }
        if (view instanceof e9) {
            int[] iArr = this.f3083c;
            ((e9) view).a(iArr);
            pbVar.h = iArr[0];
            pbVar.f3485i = iArr[1] - this.f3087s;
        } else if (view instanceof org.telegram.ui.Components.ka) {
            pbVar.h = ((org.telegram.ui.Components.ka) view).V2;
            pbVar.f3485i = (view.getMeasuredHeight() - pbVar.f3484g.getPaddingBottom()) - this.f3087s;
        } else {
            pbVar.h = view.getPaddingTop();
            pbVar.f3485i = (pbVar.f3484g.getMeasuredHeight() - pbVar.f3484g.getPaddingBottom()) - this.f3087s;
        }
    }

    @Override
    public final void p(long j10, int i10, r4 r4Var) {
        ArrayList arrayList;
        mm0 mm0Var = this.f3081a;
        if (mm0Var != null && (mm0Var.getParent() instanceof v)) {
            v vVar = (v) mm0Var.getParent();
            if (vVar.k(j10)) {
                vVar.f3814b0.add(r4Var);
                return;
            } else {
                r4Var.run();
                return;
            }
        }
        int i11 = 0;
        if (mm0Var != null && (mm0Var.getParent() instanceof w6)) {
            w6 w6Var = (w6) mm0Var.getParent();
            b00 b00Var = w6Var.f3908x;
            q6 q6Var = w6Var.f3907w;
            if (q6Var != null && (arrayList = q6Var.f3587c) != null && b00Var != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        l6 l6Var = (l6) arrayList.get(i11);
                        if (l6Var != null) {
                            TL_stories.StoryReaction storyReaction = l6Var.f3277c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f19451id == i10) {
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
                    int L0 = b00Var.L0();
                    int N0 = b00Var.N0();
                    if (i11 < L0 || i11 > N0) {
                        b00Var.h1(i11, AndroidUtilities.dp(60.0f));
                        mm0Var.post(r4Var);
                        return;
                    }
                }
            }
            r4Var.run();
            return;
        }
        if (this.d) {
            x8 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f3962a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        r4Var.run();
    }

    public g9(w01 w01Var) {
        this.f3083c = new int[2];
        this.f3082b = w01Var;
        this.f3081a = null;
    }
}
