package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;
public abstract class r1 {
    public static final Field f17065a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f17065a = field;
    }
}
