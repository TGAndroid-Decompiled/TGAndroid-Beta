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
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.js;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class i6 {
    public final int f1138a;
    public final ImageReceiver f1139b;
    public int f1140c;
    public boolean d;
    public float f1141e;
    public final org.telegram.ui.Components.g6 f1142f;
    public final org.telegram.ui.Components.g6 f1143g;
    public final org.telegram.ui.Components.g6 h;
    public float f1144i;
    public float f1145j;
    public float f1146k;
    public final boolean f1147l;
    public final RectF f1148m;
    public final RectF f1149n;

    public i6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f1139b = imageReceiver;
        this.f1140c = 0;
        this.d = false;
        this.f1141e = 1.0f;
        js jsVar = js.h;
        this.f1142f = new org.telegram.ui.Components.g6(profileStoriesView, 420L, jsVar);
        this.f1143g = new org.telegram.ui.Components.g6(profileStoriesView, 420L, jsVar);
        this.h = new org.telegram.ui.Components.g6(profileStoriesView, 420L, jsVar);
        this.f1148m = new RectF();
        this.f1149n = new RectF();
        this.f1138a = storyItem.f20041id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f1147l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34361x) {
            imageReceiver.onAttachedToWindow();
        }
        i30[] i30VarArr = ja.f1193a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            j9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, j9Var);
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
