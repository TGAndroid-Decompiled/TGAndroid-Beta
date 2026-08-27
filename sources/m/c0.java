package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

public abstract class c0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        r0.e dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                dVar = new r0.d(clipData, 3);
            } else {
                r0.f fVar = new r0.f();
                fVar.f46585b = clipData;
                fVar.f46586c = 3;
                dVar = fVar;
            }
            r0.j0.i(textView, dVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        r0.e dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new r0.d(clipData, 3);
        } else {
            r0.f fVar = new r0.f();
            fVar.f46585b = clipData;
            fVar.f46586c = 3;
            dVar = fVar;
        }
        r0.j0.i(view, dVar.build());
        return true;
    }
}
