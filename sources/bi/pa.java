package bi;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class pa {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new oa(storyItem).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(i2.d.j(readInt32, "(story) can't read params version = "));
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        oa oaVar = new oa(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(oaVar.getObjectSize());
            oaVar.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
