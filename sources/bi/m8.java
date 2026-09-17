package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m8 {
    public int f3348a;
    public String f3349b;
    public TLRPC.Photo f3350c;
    public TLRPC.Document d;

    public static m8 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f3348a = tL_storyAlbum.album_id;
        obj.f3349b = tL_storyAlbum.title;
        obj.f3350c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
