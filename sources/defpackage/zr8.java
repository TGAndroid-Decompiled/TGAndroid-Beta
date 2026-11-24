package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class zr8 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final lm f;
    public final lm g;
    public final lm h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public zr8(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        pb0 pb0Var = new pb0((wjb) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        s33 s33Var = s33.h;
        this.f = new lm(420L, profileStoriesView, s33Var);
        this.g = new lm(420L, profileStoriesView, s33Var);
        this.h = new lm(420L, profileStoriesView, s33Var);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.q0(gl.L(200.0f));
        imageReceiver.p0(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.y) {
            imageReceiver.I();
        }
        kz4[] kz4VarArr = x2b.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject Z1 = na7.q1(imageReceiver.d).Z1(storyItem.dialogId);
            pb0Var.k(Z1);
            imageReceiver.U(Z1, pb0Var, null);
            return;
        }
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                imageReceiver.Z(gl5.c(ba4.w(document.thumbs, gl.L(25.0f), false, null, true), storyItem.media.document), "25_25", null, null, fl5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            photo = messageMedia.photo;
        } else {
            photo = null;
        }
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.Y(null, null, gl5.i(ba4.w(arrayList, gl.L(25.0f), false, null, true), photo), "25_25", null, null, fl5.i(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
