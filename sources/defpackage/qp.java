package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
public abstract class qp {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        dv2 dv2Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                dv2Var = new cv2(clipData, 3);
            } else {
                ev2 ev2Var = new ev2();
                ev2Var.b = clipData;
                ev2Var.c = (byte) 3;
                dv2Var = ev2Var;
            }
            jdc.i(textView, dv2Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        dv2 dv2Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            dv2Var = new cv2(clipData, 3);
        } else {
            ev2 ev2Var = new ev2();
            ev2Var.b = clipData;
            ev2Var.c = (byte) 3;
            dv2Var = ev2Var;
        }
        jdc.i(view, dv2Var.build());
        return true;
    }
}
