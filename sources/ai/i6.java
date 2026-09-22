package ai;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class i6 {
    public final int f981a;
    public final ImageReceiver f982b;
    public int f983c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.c6 f984f;
    public final org.telegram.ui.Components.c6 f985g;
    public final org.telegram.ui.Components.c6 h;
    public float f986i;
    public float f987j;
    public float f988k;
    public final boolean f989l;
    public final RectF f990m;
    public final RectF f991n;

    public i6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f982b = imageReceiver;
        this.f983c = 0;
        this.d = false;
        this.e = 1.0f;
        qr qrVar = qr.h;
        this.f984f = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.f985g = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.h = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.f990m = new RectF();
        this.f991n = new RectF();
        this.f981a = storyItem.f18344id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f989l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f31541x) {
            imageReceiver.onAttachedToWindow();
        }
        o20[] o20VarArr = ia.f1012a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            f9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, f9Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
