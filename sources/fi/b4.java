package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class b4 {
    public final int f11795a;
    public final ImageReceiver f11796b;
    public int f11797c;
    public boolean d;
    public float f11798e;
    public final org.telegram.ui.Components.d6 f11799f;
    public final org.telegram.ui.Components.d6 f11800g;
    public final org.telegram.ui.Components.d6 h;
    public float f11801i;
    public float f11802j;
    public float f11803k;
    public final boolean f11804l;
    public final RectF f11805m;
    public final RectF f11806n;

    public b4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f11796b = imageReceiver;
        this.f11797c = 0;
        this.d = false;
        this.f11798e = 1.0f;
        nr nrVar = nr.h;
        this.f11799f = new org.telegram.ui.Components.d6(profileStoriesView, 420L, nrVar);
        this.f11800g = new org.telegram.ui.Components.d6(profileStoriesView, 420L, nrVar);
        this.h = new org.telegram.ui.Components.d6(profileStoriesView, 420L, nrVar);
        this.f11805m = new RectF();
        this.f11806n = new RectF();
        this.f11795a = storyItem.f28670id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f11804l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f43867y) {
            imageReceiver.P();
        }
        s10[] s10VarArr = i7.f12144a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject g22 = mp.u1(imageReceiver.d).g2(storyItem.dialogId);
            b9Var.l(g22);
            imageReceiver.i0(g22, b9Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ec.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, fc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ec.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
