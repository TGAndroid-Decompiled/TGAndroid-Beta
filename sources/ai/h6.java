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
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class h6 {
    public final int f1026a;
    public final ImageReceiver f1027b;
    public int f1028c;
    public boolean d;
    public float f1029e;
    public final org.telegram.ui.Components.e6 f1030f;
    public final org.telegram.ui.Components.e6 f1031g;
    public final org.telegram.ui.Components.e6 h;
    public float f1032i;
    public float f1033j;
    public float f1034k;
    public final boolean f1035l;
    public final RectF f1036m;
    public final RectF f1037n;

    public h6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f1027b = imageReceiver;
        this.f1028c = 0;
        this.d = false;
        this.f1029e = 1.0f;
        tr trVar = tr.h;
        this.f1030f = new org.telegram.ui.Components.e6(profileStoriesView, 420L, trVar);
        this.f1031g = new org.telegram.ui.Components.e6(profileStoriesView, 420L, trVar);
        this.h = new org.telegram.ui.Components.e6(profileStoriesView, 420L, trVar);
        this.f1036m = new RectF();
        this.f1037n = new RectF();
        this.f1026a = storyItem.f20279id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f1035l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34521x) {
            imageReceiver.onAttachedToWindow();
        }
        s20[] s20VarArr = ia.f1085a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            h9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, h9Var);
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
